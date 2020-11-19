import java.util.ArrayList;

/**
 * This class contains the method getMaxMin 
 * which allows to get the first divition in octrees, 
 * also in the method starts the call to the Octree class
 * method which starts the recursion to divide all the bee map.
 * And prints the bees in danger of collisión.
 * 
 * 
 * @author Samuel David Ben Jacob Arango Henao   
 * @version 1
 */
public class Support{
    Reader lector = new Reader();
    Node bees = new Node();
    
    /**
     * This method get the min and max values to make the first division
     * and calls the Octree method starting the creation of the octree.
     * 
     * 
     */
    public void getMaxMin(){
        this.bees = lector.reader();
        double minLat = lector.latitudes.getMin();
        double maxLat = lector.latitudes.getMax();

        double minLen = lector.lengths.getMin();
        double maxLen = lector.lengths.getMax();

        double minAlt = lector.altitudes.getMin();
        double maxAlt = lector.altitudes.getMax();

        ArrayList<Double> mins = new ArrayList();
        mins.add(minLat); mins.add(minLen); mins.add(minAlt);

        double midD = (minLat-maxLat)/2;
        double midW = (maxLen-minLen)/2;
        double midH = (maxAlt-minAlt)/2;
        double diagonal = Math.sqrt(Math.pow((midD)*111325,2) + Math.pow((midW)*111325,2) + Math.pow((midH),2));
        if (diagonal>100) {
            Octree octree=new Octree();
            octree.octree(bees,mins,midD,midW,midH);
        } else {
            choque();
        }


    }

    /**
     * Prints if all the bees on the root of the octree are in danger of collision.
     */
    public void choque() {
        System.out.println("Las abejas en las siguientes coordenadas estan en peligro de chocarse");
        Node temp = bees.head;
        while (temp != null) {
            System.out.println(temp.getData().getLatitude() + "," + temp.getData().getLength() + "," + temp.getData().getAltitude());
            temp = temp.next;
        }
    }
}
