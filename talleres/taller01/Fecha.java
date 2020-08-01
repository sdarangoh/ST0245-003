/**
 * Representa coordenadas en el espacio bidimensional, 
 * sus metodos retornan sus coordenadas, la distancia al origen,
 * el angulo con respecto al eje polar quees paralelo al eje x
 * y permite conocer la distancia entre dos puntos diferentes.
 * 
 * @author Samuel David Ben Jacob Arango Henao   
 * @version 2
 */
public class Punto2D{

    /**
     * Se definen las coordenadas para el punto en 2 dimensiones.
     */
    private double x, y;
    
    /**
     * Se crea el constructor del dato Punto2D.
     */
    public Punto2D (double x, double y){
        
        this.x = x;
        
        this.y = y;
    
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
     * Retorna la distancia que hay entre el 
     * origen del sistema coordenado y el punto
     * (O bien la coordenada radial en un sistema de coordenadas polares)
     */
    public double radio(){
        
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        
    }
    
    /**
     * Retorna el angulo que se forma entre el eje x
     * y un segmento de linea delorigen al punto
     * (O bien, la coordenada angular en un sistema de coordenadas polares)
     */
    public double angle(){
      
        return Math.atan2(y, x);
        
    }
    
    /**
     * Retorna la distancia entre dos puntos diferentes.
     */
    public double distancia(Punto2D otro){
        
        return Math.sqrt(Math.pow(x - otro.x,2) + Math.pow(y - otro.y,2));
        
    }
    
}
