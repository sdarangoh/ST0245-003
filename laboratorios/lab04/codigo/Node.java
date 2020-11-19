
/**
 * This is the personal linkedList class.
 * 
 * @author Samuel David Ben Jacob Arango Henao  
 * @version 1
 */
public class Node{
    private Bee data;
    public Node next;   
    public Node head;
    public Node end;
    private int length = 0;
    public Node(){
    }
    /**
     * Constructor of the Node.
     * 
     * @param data is an object of position and contains the points 
     * of the map. 
     */
    public Node(Bee data){
        this.data = data;        
    }
    
    /**
     * This method prints all the coordenates of each bee on the list. 
     * 
     * O(n) n = length of the list
     */
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data.getLatitude());
            System.out.println(temp.data.getLength());
            System.out.println(temp.data.getAltitude());
            temp = temp.next;
        }
    }
    
    /**
     * Returns the length of the linked list.
     * 
     * Complexity O(1)
     * 
     * @return length is the length of the linked list.
     */
    public int length(){
        return length;//C1
    }
    
    /**
     * Returns the object Bee stored in the node.
     * 
     * Complexity : O(1)
     * 
     * @return data The Bee on the map stored in the node of the list.
     */
    public Bee getData(){
        return data; //C1
    }
    
    /**
     * Returns the object Bee in the next node or null.
     * 
     * Complexity : O(1)
     * 
     * @return next 
     */
    public Node getNext(){
        return this.next; //C1
    }
    
    /**
     * Allows to insert data in the star of the line
     * 
     * complexity : O(1)
     * 
     * @param data Bee object which will heads the list.
     */
    public void add(Bee data){
        if(head == null){ //C1
            head = new Node(data); //C2
            end = new Node(data); //C3
            head.head = head; //C3
            end.head = head; //C4
        }
        else{
            Node newHead = new Node(data); //C5
            newHead.next = head; //C6
            head = newHead; //C7
            newHead.head = newHead; //C8
        }
        length = length + 1; //C9
    }
   
}
