
/**
 * Personal linked list which saves the principal
 * double minimum values for divide the root.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NodeDouble
{
    private double coordenate;
    public NodeDouble next;
    public NodeDouble head;
    private int length;
    
    /**
     * Constructor of the class.
     */
    public NodeDouble(){
        int length = 0;
    }
    
    /** 
     * Second constructor of the class, requires a double for initialization.
     * 
     * @param double coordenate.
     */
    public NodeDouble(double coordenate){
        this.coordenate = coordenate;
    }
    
    /**
     * @return int length, length of the node.
     */
    public int getLength(){
        return length;
    }

    public double getCoordenate(){
        return coordenate;
    }

    /**
     * Allows to insert data in the star of the line
     * 
     * complexity : O(1)
     * 
     * @param data Bee object which will heads the list.
     */
    public void add(double coordinate){
        if(head == null){ //C1
            head = new NodeDouble(coordinate); //C2
            head.head = head; //C3
        }
        else{
            NodeDouble newHead = new NodeDouble(coordinate); //C5
            newHead.next = head; //C6
            head = newHead; //C7
            newHead.head = newHead; //C8
        }
        length = length + 1; //C9
    }
    
    /**
     * @return double min minimum value in the list.
     */
    public double getMin(){
        NodeDouble temp = head.next;
        double min = head.coordenate;
        while(temp != null){
            min = Math.min(min, temp.coordenate);
            temp = temp.next;
        }
        return min;
    }
    
    /**
     * @return double max return the maximum value in the list.
     */
    public double getMax(){
        NodeDouble temp = head.next;
        double max = head.coordenate;
        while(temp != null){
            max = Math.max(max, temp.coordenate);
            temp = temp.next;
        }
        return max;
    }
    
    /**
     * Print all the elements on the list.
     */
    public void print(){
        NodeDouble temp = head;
        while(temp != null){
            System.out.println(temp.coordenate);
            temp = temp.next;
        }
    }
}
