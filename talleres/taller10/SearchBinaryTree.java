import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class BinaryTreeNode here.
 * 
 * @author Samuel David Ben Jacob Arango Henao   
 * @version 1
 */
public class SearchBinaryTree
{
    public int key;
    public VulnerablePerson vP;
    public SearchBinaryTree left, right;

    public SearchBinaryTree(){
        left = null;
        right = null;
    }

    public SearchBinaryTree(VulnerablePerson vP, int key){
        this.key = key;
        this.vP = vP;
        left = null;
        right = null;
    }

    public VulnerablePerson getData(){
        return vP;
    }

    public void setData(VulnerablePerson vP){
        this.vP = vP;
    }

    public SearchBinaryTree getLeft(){
        return left;
    }

    public void setLeft(SearchBinaryTree left){
        this.left = left;
    }

    public SearchBinaryTree getRight(){
        return right;       
    }

    public void setRight(SearchBinaryTree right){
        this.right = right;
    }

    public Stack traversalPreOrder(SearchBinaryTree root, Stack nodes){        
        if(root != null){
            nodes.push(root.getData());
            traversalPreOrder(root.left, nodes);
            traversalPreOrder(root.right, nodes);
        }
        return nodes;
    }

    public Stack traversalInOrder(SearchBinaryTree root, Stack nodes){
        if(root != null){
            traversalInOrder(root.left, nodes);
            nodes.push(root.getData());
            traversalInOrder(root.right, nodes);
        }
        return nodes;  
    }

    public Stack traversalPostOrder(SearchBinaryTree root, Stack nodes){
        if(root != null){
            traversalPostOrder(root.left, nodes);
            traversalPostOrder(root.right, nodes);
            nodes.push(root.getData());
        }
        return nodes;
    }

    public void addToSBT(VulnerablePerson vP, int llave){
        if(key == 0){
            this.key = llave;
            this.vP = vP;
        }
        else{
            if(llave >= key){ 
                if(right == null){
                    right = new SearchBinaryTree(vP, llave);
                }
                else{
                    right.addToSBT(vP, llave);
                }
            }
            else{
                if(left == null){
                    left = new SearchBinaryTree(vP, llave);
                }
                else{
                    left.addToSBT(vP, llave);
                }

            }
        }
    }

    public void fillTree(ArrayList<VulnerablePerson> list){
        fillTreeAux(list.size()/2, list, 0);
    }

    private void fillTreeAux(int n, ArrayList<VulnerablePerson> list, int count){
        if(count < list.size()){
            list.get(n).setKey(n);
            addToSBT(list.get(n), n);
            list.set(n, null);
            Random r = new Random();
            n = r.nextInt(list.size());
            while(list.get(n) == null){
                n = r.nextInt(list.size());
                if(count == list.size() - 1){
                    break;
                }
            }
            fillTreeAux(n, list, count + 1); 
        }
    }

    public void searchByName(String name, SearchBinaryTree SBT){
        if(SBT != null){
            if(SBT.getData().name.equals(name)){
                System.out.println(name + " " + SBT.getData().number + " " + SBT.getData().key.intValue());
            }
            else{
                searchByName(name, SBT.left);
                searchByName(name, SBT.right);
            }
        }
    }    

    public void searchByIndex(int index, SearchBinaryTree SBT){
        if(SBT != null){
            if(SBT.getData().key.intValue() == index){
                System.out.println(SBT.getData().name + " " + SBT.getData().number);
            }
            else{
                if(index >= SBT.key){
                    searchByIndex(index, SBT.right);
                }
                else{
                    searchByIndex(index, SBT.left);
                }
            }
        }
    }
}

