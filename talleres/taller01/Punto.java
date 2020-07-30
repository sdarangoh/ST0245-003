
/**
 * Representa coordenadas en el espacio.
 * 
 * @author Samuel David Ben Jacob Arango Henao   
 * @version 1
 */
public class Punto{

   
    private double radio, x, y, theta, distancia;
    
    public Punto (double x, double y){
        
        this.x = x;
        
        this.y = y;
    
    }
    
    public double x(){
        
        return x;
    
    }
    
    public double y(){
    
        return y;
    
    }
    
    public double radio(){
        
        radio = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        
        return radio;
        
    }
    
    public double angle(){
        
        theta = Math.atan2(y, x);        
        
        return theta;
    }

    public double distancia(Punto otro){
        
        double distanciaX = x - otro.x();
        
        double distanciaY = y - otro.y();
        
        distancia = Math.sqrt(Math.pow(distanciaX,2) + Math.pow(distanciaY,2));
        
        return distancia;
    }
    
    

}
