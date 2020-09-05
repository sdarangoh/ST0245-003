
/**
 * The class MergeSort, sort an array of ints in an descendant order.
 * 
 * @author Samuel David Ben Jacob Arango Henao 
 * @version v1
 */
public class MergeUnsort
{
    /**
     * The method unmergeAplictaion intiates the principal merge unsort functions
     * @param a is an int array.
     * @return an array in descendant order.
     * @see unmergeSort.
     */
    public static int[] unmergeAplication(int[] a){
        return unmergeSort(a, 0, a.length);
    }
    
    /**
     * this method merge the numbers in order into an array since the other
     * two which comes from the unmergeSort method.
     * 
     * @param a int array 
     * @param L int array
     * @param R int array
     * @return the array a rewrited in descendant order.
     * @see unmergeSort
     */
    public static int[] unmerge(int [] a, int [] L, int [] R){
        int i = 0, j = 0, k = 0;
        while ( i < L.length && j < R.length) { //here the array a is refilled whit the elements in descendant order
            if (L[i] >= R[j]) { 
                a[k] = L[i]; 
                i++; 
            } 
            else { 
                a[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 

        while (i < L.length) { //those elements which where out of the past loop are addead here.
            a[k] = L[i]; 
            i++; 
            k++; 
        } 

        while (j < R.length) { 
            a[k] = R[j]; 
            j++; 
            k++; 
        }
        return a; //here is returned a to the method unmergeSort again.
    }
    
    /**
     * This method takes an array, and the int values l and r represent
     * the initial and final position of the array. We use this whit the 
     * objective of use recurrence, creating two diferent arrays with 
     * the half of length than a.
     * @param a int array
     * @param l int
     * @param r int
     * @return 
     * @see unmerge
     */
    public static int [] unmergeSort(int[] a, int l, int r){
        int [] L = new int[r/2];
        int [] R;
        if (r % 2 == 0){ // this condition help us todefine the length of the array R
            R= new int[r/2];
        }
        else{
            R = new int[r/2 + 1];
        }
        if (r > 2){ // here the arrays L and R are filled with the elements of a
            for(int i = 0; i < L.length; i++){
                L[i] = a[i];
            }
            for(int i = 0; i < R.length; i++){
                R[i] = a[L.length + i];
            }
            unmergeSort(L, l, L.length);// then recursivity is used to devide again the two arrays            
            unmergeSort(R, l, R.length);
        }
        else{ // when r = 2, we don't use recursivity, conversely, call the function merge and start the sort of the array.
            for(int i = 0; i < L.length; i++){
                L[i] = a[i];
            }
            for(int i = 0; i < R.length; i++){
                R[i] = a[L.length + i];
            }
        }
        return unmerge(a,L,R);

    }
}
    