import java.util.Hashtable;
/**
 * Write a description of class CRM here.
 * 
 * @author Samuel David Ben Jacob Arango Henao
 * @version 1
 */
public class CRM{
    static Hashtable h = new Hashtable();
    public static void crm(){        
        h.put("Google", "Estados Unidos");
        h.put("La locura", "Colombia");
        h.put("Nokia", "Finlandia");
        h.put("Sony", "Japon");
    }

    public static String getKey(String value){
        String country = "";
        String existCountry = "";
        Object[] a = new Object[4];        
        a = h.keySet().toArray();
        for(Object x: a){
            country = x.toString();
            if(value.equals(h.get(country))){
                existCountry = country;
            }
        }
        return existCountry;
    }

    public static void main(String[] args){
        crm();
        if(h.containsKey("Google")){
            System.out.println("Google está en la tabla");
        }
        else{
            System.out.println("Usted no ha agregado a Google a su CRM");
        }
        if(h.containsKey("Motorola")){
            System.out.println("Motorola está en la tabla");
        }
        else{
            System.out.println("Usted no ha agregado a Motorola a su CRM");
        }
        if(h.containsValue("India")){
            System.out.println(getKey("India"));            
        } 
        else{
            System.out.println("No ha agregado ninguna empresa de India");
        }
        if(h.containsValue("Estados Unidos")){
            System.out.println(getKey("Estados Unidos"));
        }
        else{
            System.out.println("No ha agregado ninguna empresa de Estados Unidos");
        }
    }

}
