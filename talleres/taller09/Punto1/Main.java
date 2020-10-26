import java.util.Scanner;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        Reader lector = new Reader();
        Node table = new Node();
        HashTable h = new HashTable();
        table = lector.readerList();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese un nombre");
            System.out.println(h.search(table, scan.nextLine()));
        }
    }    
}
