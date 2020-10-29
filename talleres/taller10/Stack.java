
/**
 * Write a description of class Stack here.
 * 
 * @author Smuel David Ben Jacob Arango Henao    
 * @version 1
 */
public class Stack
{
    private VulnerablePerson data;
    public Stack next;
    public Stack upper;
    private int length;
    public Stack lower;
    public Stack(){
        this.next = null;
        this.upper = null;
        this.lower = null;
        this.data = null;
        int length = 0;
    }

    public Stack(VulnerablePerson data){
        this.data = data;
        int length = 0;
    }

    public void setData(VulnerablePerson data){
        this.data = data;
    }

    public VulnerablePerson getData(){
        return data;
    }

    public void push(VulnerablePerson data){
        Stack newStack = new Stack(data);
        if(upper == null){
            upper = newStack;
            lower = newStack;
        }
        else{
            newStack.next = upper; 
            upper = newStack;
        }
        length = length + 1;
    }

    public Stack pop(){
        if(upper != null){
            Stack returns = upper;
            upper = upper.next;
            length = length - 1;
            return returns;
        }
        else{return null;}
    }

}
