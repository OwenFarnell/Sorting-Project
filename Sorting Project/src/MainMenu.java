import java.util.Scanner;

import java.util.ArrayList;
import java.util.Random;
public class MainMenu
	{

		public static void main(String[] args)
			{	
			start();
			} 

      
		public static void start()
			{
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);

				System.out.println("Choose a Sorting Method to use: \n(1) Bubble Sort \n(2) Mergesort \n(3) Insertion Sort \n(4) Quicksort \n(5) Selection Sort");
				int menuChoice = userIntInput.nextInt();

				if (menuChoice == 1)
					{
						BubbleSort.main(null);
					}
				if (menuChoice == 2)
					{
						merge();
					}
				if (menuChoice == 3)
					{
						insertion();
					}
				if (menuChoice == 4)
					{
						quick();
					}
				if (menuChoice == 5)
					{
						selection();
					}
				else
					{
						start();
					}
			}
		
		
		public static void merge()
			{
				
			}
		public static void insertion()
			{
				
			}
		public static void quick()
			{
				
			}
		public static void selection()
			{
				
			}
	}
