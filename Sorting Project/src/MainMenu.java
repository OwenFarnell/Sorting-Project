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

				System.out.println("Choose a Sorting Method to use: \n(1) Bubble Sort \n(2) Mergesort \n(3) Insertion Sort \n(4) Quicksort \n(5) Selection Sort \n(6) all");
				int menuChoice = userIntInput.nextInt();

				if (menuChoice == 1)
					{
						BubbleSort.main(null);
					}
				if (menuChoice == 2)
					{
						MergeSort.main(null);
					}
				if (menuChoice == 3)
					{
						InsertionSort.main(null);
					}
				if (menuChoice == 4)
					{
						QuickSort.main(null);
					}
				if (menuChoice == 5)
					{
						SelectionSort.main(null);
					}
				if(menuChoice == 6)
					{
						allTest();
					}
				else
					{
						start();
					}
			}


		private static void allTest()
			{
				System.out.println("--------------------------------------------------");
				BubbleSort.main(null);
				MergeSort.main(null);
				InsertionSort.main(null);
				QuickSort.main(null);
				SelectionSort.main(null);
				System.out.println("--------------------------------------------------");
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);

				System.out.println("(1) Back to the menu or (2) run again?");
				int menuChoice2 = userIntInput.nextInt();
				if (menuChoice2 == 1)
					{
						start();
					}
				if (menuChoice2 == 2)
					{
						allTest();
					}
			}
		
	}
