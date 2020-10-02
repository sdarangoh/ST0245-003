import java.util.Scanner;
/**
 * This class contains the operation between the data on the linked list.
 * 
 * @see Postion2D
 * @see Node
 * 
 * @author Samuel David Beb Jacob Arango Henao
 * @version 01
 */
public class DataStructure
{
    /**
     * This method realices the calculus needed to find the Distance between positions.
     * This mathod is just for made the calculus and is an auxiliar method forget distance method.
     * 
     * Complexity: O(1)
     * 
     * @see getDistance
     * @param sourcePosition inicial position 
     * @param finalPosition final position
     * @return double  distance between two positions of the map.
     */
    private double auxDistance(Position2D sourcePosition, Position2D destinationPosition){
        return Math.sqrt((sourcePosition.getX() - destinationPosition.getX())*(sourcePosition.getX() - destinationPosition.getX())
            + (sourcePosition.getY() - destinationPosition.getY())*(sourcePosition.getY() - destinationPosition.getY())); //C1
    }
    
    /**
     * This method uses the gived list and asks about the ssource and destination positions,
     * then uses the auxDistance method to get and print the distance between two diferent positions.
     * 
     * Complexity: O(N)
     * 
     * @see auxDistance
     * @param list is the Linked list wich contains the nodes with the positions.
     */
    public void getDistance(Node list){
        double distance = 0;//C1
        Scanner scan = new Scanner(System.in);//C2
        Scanner scan2 = new Scanner(System.in);//C3
        System.out.println("Insert the source position ID "); //C4
        long ID1 = scan.nextLong();  //C5
        System.out.println("Insert the destination position ID "); //C5
        long ID2 = scan2.nextLong(); //C6
        Node temp2; //C7
        temp2 = list.head; //C8
        Position2D p1 = temp2.getData(); //C9
        while(temp2.next != null && p1.getID() != ID1){ //N
            p1 = temp2.next.getData(); //K1N
            temp2 = temp2.next; //K2N
        }
        Node temp3;//C10
        temp3 = list.head;//C11
        Position2D p2 = temp3.getData();//C12
        while(temp3.next != null && p2.getID() != ID2){ //N
            p2 = temp3.next.getData(); //I1N
            temp3 = temp3.next;//I2N
        }
        System.out.println("La distancia entre " + ID1 + " y " + ID2 + " es :" +
            auxDistance(p1,p2)); //C13
    }
    
    /**
     * This method prints all the elements stored in the linkedList.
     * 
     * Complexity: O(N)
     * 
     * @param list the list which contains the points on the map.
     */
    public static void showList(Node list){
        Node temp = list.head;//C1
        while(temp.next != null){//N
            Position2D p = temp.getData();//K1N
            double coordinateX = p.getX();//K2N
            long ID = p.getID();//K3N
            double coordinateY = p.getY();//K4N            
            System.out.println(ID + "  " + coordinateX + "  " + coordinateY);//K5N           
            temp = temp.next;//K6N
        }
    }
}
