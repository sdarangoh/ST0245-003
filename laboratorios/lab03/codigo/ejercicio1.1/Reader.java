import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
/**
 * This class has a method which reads the archive with the 
 * elements on the map in a bidimensional order
 * 
 * @author Samuel David Ben Jacob Arango Henao
 * @version 01
 */
public class Reader{ 
    /**
     * This method reads the archive and separates the information
     * on each line in coordinate X, coordinate Y and ID, creates 
     * the object Position2D, and stores it in a new node at the end of the list.
     * 
     * Complexity : O(N*M) but the M is not bigger than 5 then the complexity is O(N)
     * 
     * @return list The linkedlist whith all the points on the map.
     */
    public static Node reader(){    
        Scanner scan = null; //C1
        Scanner scan1 = new Scanner(System.in); //C2
        String archivo = scan1.nextLine();  //C3
        Position2D p = new Position2D(0,0,0); //C4
        Node list = new Node(p); //C5
        try {
            File file = new File(archivo); //C6
            scan = new Scanner(file); //C7
            scan.nextLine(); //C8
            scan.nextLine(); //C9
            while (scan.hasNextLine()){ // N
                String param = scan.nextLine(); //K1N
                Scanner scan2 = new Scanner(param); //K2N
                Scanner scan3 = new Scanner(param); //K3N
                scan2.useDelimiter(" "); //K4N
                long ID = 0; //K5N
                double coordinateX = 0; //K6N
                double coordinateY = 0; //K7N
                if(scan2.hasNextDouble()){ //K8N
                    for (int i = 0; scan2.hasNext(); i++){ // N*M
                        String campo = scan2.next(); //N*M*I1
                        if (i == 0) ID = Long.parseLong(campo); //N*M*I2 
                        if (i == 1) coordinateY = Double.parseDouble(campo); //N*M*I3
                        if (i == 2) coordinateX = Double.parseDouble(campo); //N*M*I4
                    } 
                    Position2D data = new Position2D(coordinateX, coordinateY, ID); //K9N
                    list.insertEnd(data); //K10N
                }
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
