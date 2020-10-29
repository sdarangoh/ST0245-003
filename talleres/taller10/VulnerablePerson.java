
/**
 * Write a description of class VulnerabilityCondition here.
 * 
 * @author Samuel David Ben Jacob Arango Henao 
 * @version 1
 */
public class VulnerablePerson
{
    public String name;
    public String number;
    public Integer key;
    
    public VulnerablePerson(String name, String number){
        this.name = name;
        this.number = number;
        this.key = null;
    }
    
    public VulnerablePerson(String name, String number, int key){
        this.name = name;
        this.number = number;
        this.key = key;
    }
    
    public void setKey(Integer key){
        this.key = key; 
    }
    
    
}
