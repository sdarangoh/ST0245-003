import java.util.ArrayList;
/**
 * Write a description of class Algoritmo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Algoritmo
{
    public static void algorithm(ArrayList<Integer> a){
        Tree build = new Tree();
        for(int x: a){
            build.addToSBT(x);
        }
        Queue fila = new Queue();
        fila = build.traversalPostOrder(build, fila);
        Queue temp = fila.first;
        while(temp != null){
            System.out.print(temp.getData() + ", ");
            temp = temp.next;
        }
    }
}
