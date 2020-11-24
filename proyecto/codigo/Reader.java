import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
/**
 * 
 * @author Samuel David Ben Jacob Arango Henao
 * @version 01
 */
public class Reader{
    public static ArrayList<StudentCompare> compare = new ArrayList();
    public static Node list = new Node(); ;
   
    public static Node reader(String archive){ 
        
        Scanner scan = null; //C1
        String archivo = archive;  //C3    
        try {
            
            File file = new File(archivo); //C6
            scan = new Scanner(file); //C7
            scan.nextLine(); //C8
            int j = 0;
            while (scan.hasNextLine()){                
                String param = scan.nextLine(); //K1N
                Scanner scan2 = new Scanner(param); //K2N
                scan2.useDelimiter(";"); //K4N
                String ID = "";//K5N
                String preparation =""; //K6N
                Student s = new Student(j);
                StudentCompare c = new StudentCompare();
                for (int i = 0; scan2.hasNext(); i++){ // N*M
                    String campo = scan2.next();
                    if (i == 0) s.setID(campo); //N*M*I2 
                    if (i == 65) {if (Float.parseFloat(campo) > 45){ s.plusLeng();}}
                    if (i == 66) {if (Float.parseFloat(campo) > 45){ s.plusMath();}}
                    if (i == 67) {if (Float.parseFloat(campo) > 45){ s.plusBio();}}
                    if (i == 68) {if (Float.parseFloat(campo) > 45){ s.plusChem();}}
                    if (i == 69) {if (Float.parseFloat(campo) > 45){ s.plusPhy();}}
                    if (i == 70) {if (Float.parseFloat(campo) > 45){ s.plusSoci();}}
                    if (i == 71) {if (Float.parseFloat(campo) > 45){ s.plusFil();}}
                    if (i == 72) {if (Float.parseFloat(campo) > 45){ s.plusEng();}}
                    if (i == 59) {if (campo.equals("URBANO")) {s.plusArea();}}
                    if (i == 77) {if (Integer.parseInt(campo) == 1) { c.succes();}}
                } 
                compare.add(c);
                list.add(s); //K10N     
                
                j++;
            }
        }
        catch (FileNotFoundException fnfe){
            System.out.println(fnfe);
        }
        catch (Exception e ){
            e.printStackTrace();
        }
        finally {if(scan != null) scan.close();}     
        return list; //C10
    } 
    
    public void reset(){
        this.list = new Node();
        this.compare = new ArrayList();
    }
}

