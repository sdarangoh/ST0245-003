import java.util.LinkedList;
/**
 * Write a description of class Cambio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cambio{    
    public String change(LinkedList<String> list){
        String txt = "";  
        
        for(int i = 0; i < list.size() - 1;){            
            if(i < list.size() && list.get(i).equals("[") == false 
                && list.get(i).equals("]") == false){
                txt = txt + list.get(i);
                i = i + 1;
            }
            else{
                if(i < list.size() && list.get(i).equals("[")){    
                    list.set(i, "");
                    int j = 1;
                    while(i + j < list.size() && list.get(i + j).equals("[") == false
                    && list.get(i + j).equals("]") == false){
                        list.set(i, list.get(i) + list.get(i + j));
                        j++;
                    }     
                    txt = list.get(i) + txt;
                    i = i + j;                
                }
                
                if(i < list.size() && list.get(i).equals("]")){
                    list.set(i, "");
                    int k = 1;
                    while(i + k < list.size() && list.get(i + k).equals("]") == false
                    && list.get(i + k).equals("[") == false){
                        txt = txt + list.get(i + k);
                        k++;
                    }
                    i = i + k;   
                }
            }
        }
        return txt;
    }
}