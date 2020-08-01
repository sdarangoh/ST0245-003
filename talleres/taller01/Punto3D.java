
/**
 * Representa coordenadas en el espacio tridimensional, 
 * sus metodos retornan sus coordenadas, la distancia al origen,
 * el angulo con respecto al plano xy,
 * el angulo con respecto al eje polar que es paralelo al eje x,
 * el angulo con respecto al eje z
 * y permite conocer la distancia entre dos puntos diferentes.
 * 
 * @author Samuel David Ben Jacob Arango Henao   
 * @version 1
 */
public class Punto3D{

    /**
     * Se definen las coordenadas para el punto en 3 dimensiones.
     */
    private double x, y, z;
    
    /**
     * Se crea el constructor del dato Punto3D.
     */
    public Punto3D (double x, double y, double z){
        
        this.x = x;
        
        this.y = y;
        
        this.z = z;
    
    }
    
    /**
     * Retorna la coordenada sobre el eje X
     */
    public double x(){
        
        return x;
    
    }
    
    /**
     * Retorna la coordenada sobre el eje Y
     */
    public double y(){
    
        return y;
    
    }
    
    /**
     * Retorna la coordenada sobre el eje Z
     */
    public double z(){
        
        return z;
    
    }
    
    /**
     * Retorna la distancia que hay entre el 
     * origen del sistema coordenado y el punto
     * (O bien la coordenada radial en un sistema de coordenadas esfericas)
     */
    public double radio(){
        
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
        
    }
    
    /**
     * Retorna el angulo que se forma entre el eje x 
     * y la proyección ortogonal del radio sobre el plano xy
     * (O bien la coordenada theta en un sistema de coordenadas esférico)
     */
    public double theta(){
      
        return Math.atan2(y, x);
        
    }
    
    /**
     * Retorna el angulo que se forma entre el eje z 
     * y el radio.
     * (O bien la coordenada phi en un sistema de coordenadas esférico)
     */
    public double phi(){
      
        return Math.acos(z / Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2)));
        
    }
    
    /**
     * Retorna el angulo que se forma entre el plano xy
     * y el radio.
     */
    public double angle(){
      
        return Math.atan2(z, Math.sqrt(Math.pow(x,2) + Math.pow(y,2)));
        
    }
    
    /**
     * Retorna la distancia entre dos puntos diferentes.
     */
    public double distancia(Punto3D otro){
        
        return Math.sqrt(Math.pow(x - otro.x,2) + Math.pow(y - otro.y,2) + Math.pow(z - otro.z,2));
        
    }
    
}
