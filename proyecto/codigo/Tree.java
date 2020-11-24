
/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree{
    public Tree root;
    public Tree left;
    public Tree right;
    private Node listOfData;
    
    public Tree(){
        Tree left = null;
        Tree center = null;
        Tree right = null;
    }
    
    public Tree(Node listOfData){
        this.listOfData = listOfData;
        Tree left = null;
        Tree center = null;
        Tree right = null;
    }
        
    public void setLeft(Node listOfSucces){        
        left = new Tree(listOfSucces);
    }
    
    public void setRight(Node listOfFail){
        right = new Tree(listOfFail);
    }
    
    public Node getListOfData(){
        return listOfData;
    }
    
    public Tree getLeft(){
        return left;
    }
    
    public Tree getRight(){
        return right;
    }
}
