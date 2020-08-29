
/**
 * Write a description of class Taller5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taller5{

    public static void insertionSort(int[] a){
        cicloVerdeDeGeegForGeeks(a);
    }
    public static void cicloVerdeDeGeegForGeeks(int[] a){
        for(int i = 0; i < a.length; i++ )
            cicloRojoDeGeekForGeeks(a, i);
    }
    public static void cicloRojoDeGeekForGeeks(int[] a, int indiceRojo){
        for(int j = indiceRojo; j > 0 ; j--)
            bailecito(a, j, j-1);
    }
    public static void intercambiar(int[] a, int izquierda, int derecha){
        int aux = a[izquierda];
        a[izquierda] = a[derecha];        
        a[derecha] = aux;
    }
    public static void bailecito(int[] a, int izquierda, int derecha){
        if (a[derecha] < a[izquierda])
            intercambiar(a, izquierda, derecha);
    }
    public static int suma(int[] a){
        int acum = 0;  //   c1 
        for (int i = 0; i < a.length; i++) //c2 + c3n
            acum = acum + a[i]; //  c4*n
        return acum; //c5
    }                // T(n) = c1 + c2 + c3n + c4n + c5 es O(n)

}