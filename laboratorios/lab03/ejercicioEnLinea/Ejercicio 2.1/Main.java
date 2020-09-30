
/**
 * Implementation of the reader and switch calsses
 * 
 * @author Samuel David Ben Jacob Arango Henao  
 * @version 01
 */
public class Main
{
    public static void main(String [] args){
        Reader r = new Reader();
        Switch c = new Switch();
        System.out.println(c.change(r.reader()));
    } 
}
