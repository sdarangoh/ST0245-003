import java.util.Scanner;
/**
 * This class reads the lines typed on the nroken keyboard
 * 
 * @author Samuel David Ben Jacob Arango Henao
 * @version 01
 */
public class Reader{
    public Node reader(){
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        Node list = new Node("" + frase.charAt(0));
        list.head = list;
        Node temp = list;
        for(int i = 1; i < frase.length(); i ++){
            Node newNode = new Node("" + frase.charAt(i));
            temp.next = newNode;
            temp = temp.next;
        }
        return list;
    }   
}
