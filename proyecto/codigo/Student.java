
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    private String ID;
    private byte leng;
    private byte math;
    private byte bio;
    private byte chem;
    private byte phy;
    private byte soci;
    private byte fil;
    private byte eng;
    private byte succes;
    private int order;
    private byte area; 
    
    public void resetSucces(){
        succes = 0;
    }

    public Student(int order){
        String ID = "";
        byte leng = 0;
        byte math = 0;
        byte bio = 0;
        byte chem = 0;
        byte phy = 0;
        byte soci = 0;
        byte fil = 0;
        byte eng = 0;
        byte succes = 0;
        byte prepared = 0;
        this.order = order;
        byte area = 0;
    }

    public void plusArea(){
        area++;
    }

    public byte getArea(){
        return area;
    }

    public int getOrder(){
        return order;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public String getID(){
        return ID;
    }

    public byte getSucces(){
        return succes;
    }

    public byte getApproved(){
        return leng;
    }

    public byte getMath(){
        return math;
    }    

    public byte getBio(){
        return bio;
    }

    public byte getChem(){
        return chem;
    }

    public byte getPhy(){
        return phy;
    }

    public byte getSoci(){
        return soci;
    }

    public byte getFil(){
        return fil;
    }

    public byte getEng(){
        return eng;
    }
    
    public byte getLeng(){
        return leng;
    }

    public void plusLeng(){
        leng++;
    }

    public void plusMath(){
        math++;
    }

    public void plusBio(){
        bio++;
    }

    public void plusChem(){
        chem++;
    }

    public void plusPhy(){
        phy++;
    }

    public void plusSoci(){
        soci++;
    }

    public void plusFil(){
        fil++;
    }

    public void plusEng(){
        eng++;
    }

    public void setSucces(){
        succes++;
    }
}
