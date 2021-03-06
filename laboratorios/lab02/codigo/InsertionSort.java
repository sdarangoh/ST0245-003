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
        int i = 0;
        for (int j = 0; j < a.length; j++){ 
            aux = a[j]; 
            i = j-1; 
            while (i >= 0 && a[i] > aux) { // interchanges the values of the array while the element i of the array is bigger than the rightside element. 
                a[i + 1] = a[i];  
                i = i - 1;  
            }  
            a[i + 1] = aux;  
        } 

        return a;
    }
}
