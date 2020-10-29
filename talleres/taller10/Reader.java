import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;
/**
 * Write a description of class Reader here.
 * 
 * @author Samuel David Ben Jacob Arango Henao
 * @version (a version number or a date)
 */
public class Reader
{

    public static ArrayList<VulnerablePerson> reader(){    
        Scanner scan = null; //C1
        Scanner scan2 = null;
        Scanner scan1 = new Scanner(System.in); //C2
        String archivo = scan1.nextLine();  //C3
        ArrayList<VulnerablePerson> list = new ArrayList();
        try {
            File file = new File(archivo); //C6
            scan = new Scanner(file); //C7
            scan.nextLine(); //C8
            while (scan.hasNextLine()){ // N
                String param = scan.nextLine();
                scan2 = new Scanner(param);
                scan2.useDelimiter(",");
                String persona = "";
                String numero = "";
                for(int i = 0; scan2.hasNext(); i++){
                    String campo = scan2.next();
                    if(i == 0){persona = campo;}
                    if(i == 1){persona = persona + " " + campo;}
                    if(i == 3){numero = campo;}                
                }
                VulnerablePerson vP = new VulnerablePerson(persona, numero);
                list.add(vP);
            }
        }
        catch (FileNotFoundException fnfe){
            System.out.println(fnfe);
        }
        catch (Exception e ){
            e.printStackTrace();
        }
        finally {if(scan != null) scan.close();}   
        return list;
    } 
}
