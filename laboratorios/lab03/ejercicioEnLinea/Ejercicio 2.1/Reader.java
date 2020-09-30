import java.util.LinkedList;
import java.util.Scanner;
/**
 * Write a description of class Reader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reader{
    public LinkedList<String> reader(){
        Scanner scan = new Scanner(System.in);
        LinkedList<String> list = new LinkedList();
        String frase = scan.nextLine();
        for(int i = 0; i < frase.length(); i++){
            list.add("" + frase.charAt(i));
        }
        return list;
    }   
}
