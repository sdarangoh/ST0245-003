
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{

    private int dia, mes, año;

    public Fecha(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        
    }

    public int dia(){
        return dia;
    }
    
    public int mes(){
        return mes;
    }
    
    public int año(){
        return año;
    }
    
    public String fecha(){
        String fecha = "";
        fecha = fecha + dia + "/" + mes + "/" + año;
        return fecha;
    }
    
    public String compararFechas(Fecha otra){
        String comparacion = "";
        
        if (otra.año() > año){comparacion = otra.fecha() + " es después de " + fecha();}
        else {if (otra.año() < año){comparacion = otra.fecha() + " es ántes de " + fecha();}
            else {if (otra.mes() > mes){comparacion = otra.fecha() + " es después de " + fecha();}
                else {if (otra.mes() < mes){comparacion = otra.fecha() + " es ántes de " + fecha();}
                    else {if (otra.dia() > dia()){comparacion = otra.fecha() + " es después de " + fecha();}
                        else {if (otra.dia() < dia()){comparacion = otra.fecha() + " es ántes de " + fecha();}
                            else{comparacion = otra.fecha() + " es el mismo día que " + fecha();}}}}}}
                 
        return comparacion;
    }
    
    
}
