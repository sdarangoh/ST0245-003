import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
/**
 * 
 * 
 * @author Samuel David Ben Jacob Arango Henao
 * @version 01
 */
public class Reader{ 

    public static List reader(){    
        Scanner scan = null; //C1
        Scanner scan1 = new Scanner(System.in); //C2
        String archivo = scan1.nextLine();  //C3
        List list = new List();
        try {
            File file = new File(archivo); //C6
            scan = new Scanner(file); //C7
            scan.nextLine(); //C8
            while (scan.hasNextLine()){ // N
                String param = scan.nextLine(); //K1N
                list.insertEnd(param); //K10N
            }
        }
        catch (FileNotFoundException fnfe){
            System.out.println(fnfe);
        }
        catch (Exception e ){
            e.printStackTrace();
        }
        finally {if(scan != null) scan.close();}   
        System.out.println(list.getLength());
        return list;
    } 

    public Node readerList(){
        List list = new List();
        list = reader();
        Scanner scan = null;
        Scanner scan1 = null;
        Node table = new Node();
        HashTable h = new HashTable();
        table = h.createTable(list.getLength());
        List temp = list.head;
        while(temp != null){
            scan = new Scanner(temp.getData());
            String data = scan.nextLine();
            scan1 = new Scanner(data);
            scan1.useDelimiter(",");
            String persona = "";
            String numero = "";
            for(int i = 0; scan1.hasNext(); i++){
                String campo = scan1.next();
                if(i == 0){persona = campo;}
                if(i == 1){persona = persona + " " + campo;}
                if(i == 3){numero = campo;}                
            }
            PersonaNumero pn = new PersonaNumero(persona, numero);
            int index = h.HashFunction(persona, list.getLength());
            h.addToHashTable(table, pn, index);  
            temp = temp.next;
        }
        return table;
    }
}

