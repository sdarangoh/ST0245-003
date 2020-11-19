import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
/**
 * This class has a method which reads the archive with the 
 * elements on the map.
 * 
 * @author Samuel David Ben Jacob Arango Henao
 * @version 01
 */
public class Reader{ 
    public static NodeDouble latitudes = new NodeDouble();
    public static NodeDouble lengths = new NodeDouble();
    public static NodeDouble altitudes = new NodeDouble();
    /**
     * This method reads the archive and separates the information
     * on each line in coordinate X, coordinate Y and coordinate Z, creates 
     * the object bee, and stores it in a new node at the end of the list.
     * also fill the NodeDouble linked lists with the coordenates.
     * 
     * Complexity : O(N)
     * 
     * @return list The linkedlist whith all the points on the map.
     */
    public static Node reader(){    
        Scanner scan = null; //C1
        Scanner scan1 = new Scanner(System.in); //C2
        String archivo = scan1.nextLine();  //C3
        Bee p = new Bee(0,0,0); //C4        
        Node list = new Node();
        try {
            File file = new File(archivo); //C6
            scan = new Scanner(file); //C7
            scan.nextLine(); //C8
            while (scan.hasNextLine()){ // N
                String param = scan.nextLine(); //K1N
                Scanner scan2 = new Scanner(param); //K2N
                scan2.useDelimiter(","); //K4N
                double coordinateX = 0; //K5N
                double coordinateY = 0; //K6N
                double coordinateZ = 0; //K7N                
                for (int i = 0; scan2.hasNext(); i++){ // N*M
                    String campo = scan2.next(); //N*M*I1
                    if (i == 0) coordinateX = Double.parseDouble(campo); //N*M*I2 
                    if (i == 1) coordinateY = Double.parseDouble(campo); //N*M*I3
                    if (i == 2) coordinateZ = Double.parseDouble(campo); //N*M*I4
                } 
                latitudes.add(coordinateX);
                lengths.add(coordinateY);
                altitudes.add(coordinateZ);
                Bee data = new Bee(coordinateX, coordinateY, coordinateZ); //K9N
                list.add(data); //K10N                
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
}
