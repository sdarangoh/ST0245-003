
/**
 * This is the personal linkedList class.
 * 
 * @author Samuel David Ben Jacob Arango Henao  
 * @version 1
 */
public class Node{
    private Student data;
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
    public Node(Student data){
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
     * Returns the object Bee stored in the node.
     * 
     * Complexity : O(1)
     * 
     * @return data The Bee on the map stored in the node of the list.
     */
    public Student getData(){
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

    public Node addNode(Node add){   
        if(head == null){
            head = add;
            end = add.end;
        }
        else{
            if(end == null){
                end = add.end;
            }
            else{
                end.next = add;
                end = add.end;
            }
            head.head = head;
        }
        length = length + add.length;
        return head;
    }
    
    public int contar(Node n){
        int c = 0;
        Node temp = n.head;
        while(temp != null){
            c = c + 1;
            temp = temp.next;
        }
        System.out.println(c);
        return c;
    }
    
    /**
     * Allows to insert data in the star of the line
     * 
     * complexity : O(1)
     * 
     * @param data Bee object which will heads the list.
     */
    public void add(Student data){
        if(head == null){
            Node newEnd = new Node(data);
            head = new Node(data);
            end = head;
        }
        else{    
            Node newEnd = new Node(data);
            end.next = newEnd;
            end = newEnd;
        }
        length = length + 1; //C9
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data.getID());
            temp = temp.next;
        }
    }

}
