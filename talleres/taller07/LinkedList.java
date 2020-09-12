
/**
 * 
 * 
 * @author Samuel David Ben Jacob Arango Henao  
 * @version 1
 */
public class LinkedList{
    public LinkedList(){
        int length = 0;

    }

    ListNode head;

    private int length = 0;

    public ListNode getHead(){
        return head;
    }

    public synchronized void insert(int data, int position){
        if(position < 0){
            position = 0;
        }

        if(position > length){
            position = length;
        }

        if(head == null){
            head = new ListNode(data);
        }

        else{
            if(position == 0){
                ListNode temp = new ListNode(data);
                temp.next = head;
                head = temp;
            }
            else{
                ListNode temp = head;
                for(int i = 1; i < position; i++){
                    temp = temp.getNext();
                }
                ListNode newNode = new ListNode(data);
                newNode.next = temp.next;
                temp.setNext(newNode);

            }

        }
        length++;
    }

    public synchronized void remove(int position){
        if(position < 0){
            position = 0;
        }

        if(position > length){
            position = length - 1;
        }

        if(head == null){
            return;
        }

        if(position == 0){
            head = head.getNext();
        }
        else{
            ListNode temp = head;
            for(int i = 1; i < position; i++){
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
        length--;
    }
}