/**
 * This class changes the position in which are going to appear de letters, 
 * acording to the typed in the broken keyboard
 * 
 * @author Samuel David Ben Jacob Arango Henao 
 * @version 02
 */
public class Switch{    
    public String change(Node list){
        String txt = "";  
        Node temp = list.head;

        while(temp != null && temp.next != null){            
            if(temp != null && temp.next != null && temp.getData().equals("[") == false 
            && temp.getData().equals("]") == false){
                txt = txt + temp.getData();
                temp = temp.next;
            }
            else{
                if(temp != null && temp.next != null && temp.getData().equals("[")){    
                    Node change = temp;
                    change.setData("");
                    while(temp.next != null && temp.next.getData().equals("[") == false
                    && temp.next.getData().equals("]") == false){
                        change.setData(change.getData() + temp.next.getData());
                        temp = temp.next;
                    }     
                    txt = change.getData() + txt;
                    temp = temp.next;               
                }

                if(temp != null && temp.next != null && temp.getData().equals("]")){
                    while(temp.next != null && temp.next.getData().equals("]") == false
                    && temp.next.getData().equals("[") == false){
                        txt = txt + temp.next.getData();
                        temp = temp.next;
                    } 
                    temp = temp.next;
                }
            }
        }
        return txt;
    }
}