
/**
 * This is the personal linkedList class created specifically for this problem
 * 
 * @author Samuel david Ben Jacob Arango Henao
 * @version 01
 */

public class Node{
    private String data;
    public Node next;
    public Node head;
    public Node(String data){
        this.data = data;
    }

    public void setData(String data){
        this.data = data;
    }

    public String getData(){
        return data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }
}

