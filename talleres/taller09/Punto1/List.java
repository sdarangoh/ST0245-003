
/**
 * Write a description of class List here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class List
{
    private String data;
    public List next;
    public List head;
    public List end;
    private int length = 0;
    
    public List(){
        int length = 0;
    }
    
    public List(String data){
        int length = 0;
        this.data = data;
    }
    
    public int getLength(){
        return length;
    }

    public String getData(){
        return data;
    }

    public void insertEnd(String data){         
        if(head == null){
            List newEnd = new List(data);
            head = new List(data);
            end = head;
        }
        else{    
            List newEnd = new List(data);
            end.next = newEnd;
            end = newEnd;
        }
        length++;
    }
    
    public List getEnd(){
        return end;
    }
}