import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of class Taller4 here.
 * 
 * @author Samuel David Ben Jacob Arango Henao
 * @version 1
 */
public class Taller4
{
    /**
     * This method takes one ArrayList, and uses de method maxEv.
     * @imput ArrayList<Integger> a
     * @output int higher value element on a.
     */
    public static int arrayMax(int [] a, int b){
        return maxEv(a, 0, 0);
    } 

    /**
     * This method is which search the maximum number in the ArrayList
     * @imput ArrayList<Integger> a, int indice, int maximo.
     * @output int maximo ass the higher number in the array.
     */
    private static int maxEv(int [] a, int indice, int maximo){
        int newMax = Math.max(a[indice], maximo);
        if(indice == a.length - 1){
            return newMax;            
        }
        else{
            return maxEv(a, indice + 1, newMax);

        }
    }

    public static boolean groupSum(int indice, int [] a, int volumen){
        return sumAux(a, volumen, indice, volumen);
    }
    static int i = 0;
    private static boolean sumAux(int [] a, int volumen, int indice, int original){        
        boolean resultado = false;   

        if (volumen - a[indice] == 0){resultado = true; return resultado;}
        if (volumen < 0){    
            i = i + 1;
            return sumAux(a, original, i, original);          
        }
        else{
            if (indice + 1 == a.length){return false;}
            else{
                return sumAux(a, volumen - a[indice], indice + 1, original);
            }
        }
    }        
}

