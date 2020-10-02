
/**
 * This is the personal linkedList class.
 * In this class, I included a direct pointer to the last element, 
 * that allows me to have a O(1) complexity adding elments to the end of the line,
 * but is not a double or a circular list, becouse the nodes doesn't have a
 * pointer to the element before them.
 * 
 * @author Samuel David Ben Jacob Arango Henao  
 * @version 1
 */
public class Node{
    private Position2D data;
    public Node next;   
    public Node head;
    public Node end;
    private int length = 0;
    /**
     * Constructor of the Node.
     * 
     * @param data is an object of position and contains the points 
     * of the map. 
     */
    public Node(Position2D data){
        this.data = data;        
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
     * Returns the object Position2D stored in the node
     * 
     * Complexity : O(1)
     * 
     * @return data The point on the map stored in the node of the list.
     */
    public Position2D getData(){
        return data; //C1
    }
    
    /**
     * Returns the object Position2D in the next node or null.
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
     * @param data Position2D object which will heads the list.
     */
    public void insertStart(Position2D data){
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
    
    /**
     * Allows to insert data in the final of the line using the 
     * pointer to the end element in the list.
     * 
     * complexity : O(1)
     * 
     * @param data Position2D object which will be in the final  of the list.
     */
    public void insertEnd(Position2D data){         
        if(head == null){ //C1
            Node newEnd = new Node(data); //C2
            head = new Node(data); //C3
            end = head; //C4
            end.head = head; //C5
        }
        else{    
            Node newEnd = new Node(data); //C6
            newEnd.head = head; //C7
            end.next = newEnd; //C8
            end = newEnd; //C9           
        }
        length = length + 1; //C10
    }

}
