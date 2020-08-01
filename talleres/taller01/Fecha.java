/**
 * Est clase tiene por objetivo representar una fecha con formato DD/MM/AAAA, 
 * permitir acceder al año, mes u hora en especifico
 * y poder compararla con otra.
 * 
 * @author Samuel David Ben Jacob Arango Henao
 * @version 2
 */
public class Fecha
{
    /** 
     * Se definen las variables que representaran
     * los componentes de la fecha.
     */
    private byte dia, mes;
    private short año;

    /**
     * representa el constructor de el dato Fecha.
     */
    public Fecha(byte dia, byte mes, short año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        
    }

    /**
     * Este metodo retorna el dia de la fecha.
     */
    public byte dia(){
        return dia;
    }
    
    /**
     * Este metodo retorna el mes de la fecha.
     */
    public byte mes(){
        return mes;
    }
    
    /**
     * Este metodo retorna el año de la fecha.
     */
    public short año(){
        return año;
    }
    
    /**
     * Este metodo retorna la fecha como una cadena,
     * sus componentes iran separadas por un /.
     */
    public String fecha(){
        String fecha = "";
        fecha = fecha + dia + "/" + mes + "/" + año;
        return fecha;
    }
    
    /**
     * Este método permite comparar dos fechas distinas,
     * retorna un valor -1, si la fecha con la que se compara es ántes,
     * 0 si son iguales y 1 si la fecha con la que se compara es después.
     */
    public byte compararFechas(Fecha otra){
        byte comparacion = 0;
        
        if (otra.año*10000 + otra.mes*100 + otra.dia > año*10000 + mes*100 + dia){comparacion = 1;}
        else 
        if (otra.año*10000 + otra.mes*100 + otra.dia < año*10000 + mes*100 + dia){comparacion = -1;}

                 
        return comparacion;
    }
    
    
}
