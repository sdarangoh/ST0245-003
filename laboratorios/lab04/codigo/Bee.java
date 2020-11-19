
/**
 * This class represents the object Bee with its coordenates.
 * 
 * @author Samuel David Ben Jacob Arango Henao  
 * @version 1
 */
public class Bee
{

    private double latitude;//grades
    private double length;//grades
    private double altitude;//meters
    
    /**
     * Constructor of the class Bee.
     * 
     * @param latitude
     * @param length
     * @param altitude
     */
    public Bee(double latitude, double length, double altitude){
        this.latitude = latitude;
        this.length = length;
        this.altitude = altitude;
    }
    
    /**
     * Allows to known the laitude of the bee.
     * 
     * @return int latitude.
     */
    public double getLatitude(){
        return latitude;
    }
    
    /**
     * Allows to known the length/longitude of the bee.
     * 
     * @return int length 
     */
    public double getLength(){
        return length;
    }
    
    /**
     * Allows to known the altitude of the bee.
     * 
     * @return int altitude.
     */
    public double getAltitude(){
        return altitude;
    }

}
