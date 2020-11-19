/**
 * Write a description of class AuxList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Queue{
    public Queue previous, next;
    private int length;
    public int data;
    public Queue first, last;

    public Queue(){
        int length = 0;
    }

    public Queue(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public void add(int data){
        Queue newNode = new Queue(data);
        newNode.first = this.first;
        newNode.last = this.last;
        if(first == null){
            first = newNode;
            newNode.first = first;
            last = newNode;
            newNode.last = last;
        }
        else{
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
            first.last = last;
            newNode.last = last;
        }
        length++;
    }

    public Queue getNext(){
        return next;
    }

    public Queue getPrevious(){
        return previous;
    }

}
