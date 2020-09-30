
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String [] args){
        Reader r = new Reader();
        Cambio c = new Cambio();
        System.out.println(c.change(r.reader()));
    }
}
