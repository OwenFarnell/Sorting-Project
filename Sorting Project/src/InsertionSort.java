import java.util.Scanner;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class InsertionSort {  
	public static long start = System.currentTimeMillis();
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        } 
        long end = System.currentTimeMillis();
        float sec = (end - start) / 10000F; System.out.println("Insertion Sort took " + sec + " seconds");
        
       
    }  
       
    public static void main(String a[]){    
    	Scanner userStringInput = new Scanner(System.in);
    	Scanner userInput = new Scanner(System.in);

    	System.out.println("How many #'s?");
    	
    	int ArrayLength = userInput.nextInt();
    	int arr []= new int [ArrayLength];
    	
                 
                for(int i =0; i < ArrayLength; i++) {
            		int number = (int)(Math.random()*90)+10;
            		arr[i] = number;  
            	}
                   
                System.out.println();  
                  
                insertionSort(arr);  
                 
                 
                for(int i =0; i < ArrayLength; i++) {
            		int number = (int)(Math.random()*90)+10;
            		arr[i] = number;  
            	}      
    }    
}  