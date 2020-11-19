import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main{
    public static void main(String[]args){
        ArrayList<Integer> a = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            a.add(scan.nextInt());
        }
        Algoritmo.algorithm(a);
    }
}

