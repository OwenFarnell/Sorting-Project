import java.util.Scanner;

public class QuickSort {  
	public static long start = System.currentTimeMillis();
    public static void selectionSort(int[] arr)
    	{  
        
    		for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++)
            	{  
                if (arr[j] < arr[index])
                	{
                	
                    index = j;
                    
                }  
            }  
            int smallerNumber = arr[index];   
          arr[index] = arr[i];
            
            arr[i] = smallerNumber;  
            
        }
        long end = System.currentTimeMillis();
        float sec = (end - start) / 50000F; System.out.println("- Quick Sort took " + sec + " seconds");
        
      
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
                   
                  
                  
                selectionSort(arr);  
                 
                  
                for(int i =0; i < ArrayLength; i++) {
            		int number = (int)(Math.random()*90)+10;
            		arr[i] = number;  
            	}  
    }  
}   