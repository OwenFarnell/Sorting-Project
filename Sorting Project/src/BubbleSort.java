import java.util.Scanner;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class BubbleSort {  
	
	static long start = System.currentTimeMillis();
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){    
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }
         long end = System.currentTimeMillis();
         float sec = (end - start) / 100000F; System.out.println(sec + " seconds");
         
         MainMenu.start();
    }  
    public static void main(String[] args) {  
    	
    	    
    	Scanner userStringInput = new Scanner(System.in);
    	Scanner userInput = new Scanner(System.in);

    	System.out.println("How many #'s?");
    	
    	int ArrayLength = userInput.nextInt();
    	int arr []= new int [ArrayLength];
    	
                System.out.println("Array Before Bubble Sort");  
                for(int i =0; i < ArrayLength; i++) {
            		int number = (int)(Math.random()*90)+10;
            		arr[i] = number;  
            	}
                   
                System.out.println();  
                  
                bubbleSort(arr);  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i =0; i < ArrayLength; i++) {
            		int number = (int)(Math.random()*90)+10;
            		arr[i] = number;  
            	}     
                
        } 
    
}  