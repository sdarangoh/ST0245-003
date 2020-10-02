/**
 * The class allow us to interact with the other classes
 * 
 * @author Samuel David Ben Jacob Arango Henao
 * @version 01
 */
public class Main{
    public static void main(String [] args){
        Reader read = new Reader();
        Node list = read.reader();
        System.out.println(list.length());
        DataStructure ds = new DataStructure();
        ds.getDistance(list);
    }    
}