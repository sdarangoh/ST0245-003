/**
 * The class InsertionSort, aort an array of size n in ascendant order 
 * using the insertion algorithm.
 * 
 * @author Samuel David Ben Jacob Arango Henao
 * @version 1
 */
public class InsertionSort
{
    /**
     * inserion takes an array and sort it in ascendant order
     * 
     * @param a an int array
     * @return a an array, the same array but in ascendant order
     */
    public static int [] insertion(int [] a){
        int aux = 0;
        for (int j = 0; j < a.length; j++){
            for(int i = 0; i < a.length - 1; i ++){
                if(a[i] > a[i + 1]){
                    aux = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = aux;
                }
            }
        }
        return a;
    }
}