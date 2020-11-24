
import java.util.Scanner;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
public class Main
{
    public static void main(String [] args){
        long[] time = new long[10];    
        long[] memory = new long[10];
        long ti = System.currentTimeMillis();
        System.gc();        
        for(int j = 0; j < 100; j++){
            Tester test = new Tester("D:/EAFIT/Estructuras Datos y Algoritmos/Proyecto/0_test_balanced_5000.csv");
        }
        Runtime rt = Runtime.getRuntime();
        long usedMB = (rt.totalMemory()-rt.freeMemory())/1024/1024;
        memory[0] = usedMB;
        long tf = System.currentTimeMillis();
        time[0] = (tf - ti)/100;
        System.out.println("time: " + time[0] + " memory: " + memory[0]);
        ti = System.currentTimeMillis();
        System.gc();        
        for(int j = 0; j < 100; j++){
            Algorithm al = new Algorithm("D:/EAFIT/Estructuras Datos y Algoritmos/Proyecto/1_train_balanced_45000.csv");
        }
        rt = Runtime.getRuntime();
        usedMB = (rt.totalMemory()-rt.freeMemory())/1024/1024;
        memory[1] = usedMB;
        tf = System.currentTimeMillis();
        time[1] = (tf - ti)/100;
        System.out.println("time: " + time[1] + " memory: " + memory[1]);
        ti = System.currentTimeMillis();
        System.gc();        
        for(int j = 0; j < 100; j++){
            Tester test = new Tester("D:/EAFIT/Estructuras Datos y Algoritmos/Proyecto/1_test_balanced_15000.csv");
        }
        rt = Runtime.getRuntime();
        usedMB = (rt.totalMemory()-rt.freeMemory())/1024/1024;
        memory[2] = usedMB;
        tf = System.currentTimeMillis();
        time[2] = (tf - ti)/100;
        System.out.println("time: " + time[2] + " memory: " + memory[2]);
        ti = System.currentTimeMillis();
        System.gc();        
        for(int j = 0; j < 100; j++){
            Algorithm al = new Algorithm("D:/EAFIT/Estructuras Datos y Algoritmos/Proyecto/2_train_balanced_75000.csv");
        }
        rt = Runtime.getRuntime();
        usedMB = (rt.totalMemory()-rt.freeMemory())/1024/1024;
        memory[3] = usedMB;
        tf = System.currentTimeMillis();
        time[3] = (tf - ti)/100;
        System.out.println("time: " + time[3] + " memory: " + memory[3]);
        ti = System.currentTimeMillis();
        System.gc();        
        for(int j = 0; j < 100; j++){
            Tester test = new Tester("D:/EAFIT/Estructuras Datos y Algoritmos/Proyecto/2_test_balanced_25000.csv");
        }
        rt = Runtime.getRuntime();
        usedMB = (rt.totalMemory()-rt.freeMemory())/1024/1024;
        memory[4] = usedMB;
        tf = System.currentTimeMillis();
        time[4] = (tf - ti)/100;
        System.out.println("time: " + time[4] + " memory: " + memory[4]);
        ti = System.currentTimeMillis();
        System.gc();        
        for(int j = 0; j < 100; j++){
            Algorithm al = new Algorithm("D:/EAFIT/Estructuras Datos y Algoritmos/Proyecto/3_train_balanced_105000.csv");
        }
        rt = Runtime.getRuntime();
        usedMB = (rt.totalMemory()-rt.freeMemory())/1024/1024;
        memory[5] = usedMB;
        tf = System.currentTimeMillis();
        time[5] = (tf - ti)/100;
        System.out.println("time: " + time[5] + " memory: " + memory[5]);
        ti = System.currentTimeMillis();
        System.gc();        
        for(int j = 0; j < 100; j++){
            Tester test = new Tester("D:/EAFIT/Estructuras Datos y Algoritmos/Proyecto/3_test_balanced_35000.csv");
        }
        rt = Runtime.getRuntime();
        usedMB = (rt.totalMemory()-rt.freeMemory())/1024/1024;
        memory[6] = usedMB;
        tf = System.currentTimeMillis();
        time[6] = (tf - ti)/100;
        System.out.println("time: " + time[6] + " memory: " + memory[6]);
        ti = System.currentTimeMillis();
        System.gc();        
        for(int j = 0; j < 100; j++){
            Algorithm al = new Algorithm("D:/EAFIT/Estructuras Datos y Algoritmos/Proyecto/4_train_balanced_135000.csv");
        }
        rt = Runtime.getRuntime();
        usedMB = (rt.totalMemory()-rt.freeMemory())/1024/1024;
        memory[7] = usedMB;
        tf = System.currentTimeMillis();
        time[7] = (tf - ti)/100;
        System.out.println("time: " + time[7] + " memory: " + memory[7]);
        ti = System.currentTimeMillis();
        System.gc();        
        for(int j = 0; j < 100; j++){
            Tester test = new Tester("D:/EAFIT/Estructuras Datos y Algoritmos/Proyecto/4_test_balanced_45000.csv");
        }
        rt = Runtime.getRuntime();
        usedMB = (rt.totalMemory()-rt.freeMemory())/1024/1024;
        memory[8] = usedMB;
        tf = System.currentTimeMillis();
        time[8] = (tf - ti)/100;
        System.out.println("time: " + time[8] + " memory: " + memory[8]);
    }
}

