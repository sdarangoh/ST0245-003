/**
 * This is the personal linkedList class.
 * 
 * @author Samuel david Ben Jacob Arango Henao
 * @version 01
 */

public class Node{
    private PersonaNumero data;
    public Node next;
    public Node head;
    public Node end;
    private int length = 0;

    public Node(){
        int length = 0;
    }

    public Node(int length){
        this.length = length;
    }

    public Node(PersonaNumero data){
        int length = 0;
        this.data = data;
    }

    public int getLength(){
        return length;
    }

    public void setData(PersonaNumero data){
        this.data = data;
    }

    public PersonaNumero getData(){
        return data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }

    public boolean exist(int index){
        Node temp = head;
        boolean exist = false;
        int i = 0;
        while(i <= index){
            if(i == index && temp.getData() != null){
                exist = true;
            }
            temp = temp.next;
            i++;
        }
        return exist;        
    }

    public void insertStart(PersonaNumero data){
        if(head == null){
            Node newNode = new Node(data);
            head = new Node(data);
            end = head;
        }
        else{
            Node newNode = new Node(data);
            newNode.next = head;    
            head = newNode;
        }
    }

    public void insert(PersonaNumero data, int position){
        Node temp = head;
        for(int i = 0; i <= position; i++){
            if (i == position){
                temp.setData(data);
            }
            temp = temp.next;
        }

    }
    public void insertEnd(PersonaNumero data){         
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

    }
}