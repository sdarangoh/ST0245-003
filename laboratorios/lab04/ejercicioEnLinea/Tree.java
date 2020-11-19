
/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree
{
    public int key;
    public Tree left, right;

    public Tree(){
        left = null;
        right = null;
    }

    public Tree(int key){
        this.key = key;
        left = null;
        right = null;
    }

    public int getData(){
        return key;
    }

    public void setData(int key){
        this.key = key;
    }

    public Tree getLeft(){
        return left;
    }

    public void setLeft(Tree left){
        this.left = left;
    }

    public Tree getRight(){
        return right;       
    }

    public void setRight(Tree right){
        this.right = right;
    }

    public Queue traversalPostOrder(Tree root, Queue nodes){
        if(root != null){
            traversalPostOrder(root.left, nodes);
            traversalPostOrder(root.right, nodes);
            nodes.add(root.getData());
        }
        return nodes;
    }

    public void addToSBT(int llave){
        if(key == 0){
            this.key = llave;
        }
        else{
            if(llave >= key){ 
                if(right == null){
                    right = new Tree(llave);
                }
                else{
                    right.addToSBT(llave);
                }
            }
            else{
                if(left == null){
                    left = new Tree(llave);
                }
                else{
                    left.addToSBT(llave);
                }
            }
        }
    }
}
