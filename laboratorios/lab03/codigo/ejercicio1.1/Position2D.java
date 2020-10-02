/**
 * The class Position is the data type used for store the information of the map.
 * 
 * @author Samuel David Ben Jacob Arango Henao
 * @version 1
 */
public class Position2D{
    private double coordinateX;
    private double coordinateY;
    private long ID;
    
    /**
     * Constructor of the object with the cordenates and ID.
     * @param ID
     * @param coordinateX 
     * @param coordinateY
     */
    public Position2D(double coordinateX, double coordinateY, long ID){
        this.ID = ID;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }
    
    /**
     * this method returns the X coordinate.
     * 
     * Complexity O(1)
     * 
     * @return X coordinate
     */
    public double getX(){
        return coordinateX;
    }
    
    /**
     * this method returns the Y coordinate.
     * 
     * Complexity O(1) 
     * 
     * @return Y coordinate
     */
    public double getY(){
        return coordinateY;
    }
    
    /**
     * this method returns the ID  of the point on the map.
     * 
     * Complexity O(1)
     * 
     * @return ID
     */
    public long getID(){
        return ID;
    }
    

}
