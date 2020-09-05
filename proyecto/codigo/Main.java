import java.util.Random;
//import org.jfree.chart.*;
//import javax.swing.*;
//import org.jfree.data.category.DefaultCategoryDataset;
/**
 * The Main class excecutes the methods defined in "MergeUnsort", "MergeSort" e "Insertion Sort"
 * 
 * @author Samuel David Ben Jacob Arango Henao
 * @version 1
 */
public class Main
{   
    /**
     * Main method, we are making proofs with the MergeSort algorithm with values of the array
     * going from 10millon to 200millon, for that reason we are puting // on the side of the 
     * calls of this method, excecuting it with an array of this size will give us 4E16 order 
     * excecution time. Erase  // and reduce the n values on line26 if you want to use this method.
     * Also reduces 0 on line52 and line53 in the same proportion.
     * 
     * @see InsertionSort
     * @see MergeSort
     * @see MergeUnsort
     */
    public static void main(String [] args){
        //double [] timesInsertion = new double[20];
        double [] timesMerge = new double[20];
        for (int n = 10000000; n <= 200000000; n = n + 10000000){ //20 arrays are created in random way and evaluated in the algorithms insertion and merge sort
            int size = n;
            int max = n*2;
            int[] array = new int[size];
            //int[] arrayInsertion = new int[size];
            int[] arrayMerge = new int[size];
            Random generator = new Random();
            for (int i =0; i<array.length; i++){
                array[i] = generator.nextInt(max);
            }
            array = MergeUnsort.unmergeAplication(array); //This method sort the array in descendant order.
            
            
            //long ti = System.currentTimeMillis();

            //arrayInsertion = InsertionSort.insertion(array);

            //long tf = System.currentTimeMillis();
            
            long t1 = System.currentTimeMillis();
            
            arrayMerge = MergeSort.mergeAplication(array);
            
            long t2 = System.currentTimeMillis();
            
            //timesInsertion[(n/10000) - 1] = (tf-ti);
            timesMerge[(n/10000000) - 1] = (t2-t1);

        }
        //System.out.println("times Insertion: ");
        //for(int i = 0; i < 20; i++){
            //System.out.print(timesInsertion[i] + " ");
        //}
        System.out.println("");
        System.out.println("times Merge: ");
        for(int i = 0; i < 20; i++){
            System.out.print(timesMerge[i] + " ");
        }
        System.out.println("");
        //showGraph(timesInsertion, "Insertion Sort");
        //showGraph(timesMerge, "Merge Sort");
    }
    /**
     * showGraph method is usedto make a graph of the times for 20 diferent arrays.
     * 
     * @param times an array of double with the times measured in the main class.
     * @param nombre a String with the name of the graph
     */
    /**public static void showGraph(double[] times, String nombre){
        JFrame frame = new JFrame(nombre);
        frame.setSize(500, 270);
        frame.setLocationRelativeTo(frame.getRootPane());
        frame.setLocationRelativeTo(frame.getRootPane());
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i = 0; i < 20; i++){
            dataset.addValue(times[i], i+"", "");            
        }
        JFreeChart chart = ChartFactory.createBarChart(
                nombre,
                null,
                "Running time",
                dataset);
        ChartPanel chartPanel = new ChartPanel(chart, false);
        frame.setContentPane(chartPanel);
        frame.setVisible(true);
        
    }
    */
}
