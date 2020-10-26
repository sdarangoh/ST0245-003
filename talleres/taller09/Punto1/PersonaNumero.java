
/**
 * Write a description of class PersonasNumeros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonaNumero
{
    private String persona;
    private String numero;
    public PersonaNumero(String persona, String numero){
        this.persona = persona;
        this.numero = numero;
    }

    public String getPersona(){
        return persona;
    }

    public void setPersona(String persona){
        this.persona = persona;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }
}
