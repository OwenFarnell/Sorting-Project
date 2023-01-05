import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SorterRun
	{
		static ArrayList<SortingRun> numbers = new ArrayList<SortingRun>();
		static double timeB;
		static double timeI;
		static double timeM;
		static double timeQ;
		static double timeS;

		public static void main(String[] args)
			{
				userChoice();


			}

		public static void userChoice()
			{
				Scanner numberOfRuns = new Scanner(System.in);
				System.out.println("How many times would you like the simulation to run?");
				int runs = numberOfRuns.nextInt();

				Scanner numberOfIntegers = new Scanner(System.in);
				System.out.println("How many numbers do you want to be sorted?");
				int nums = numberOfIntegers.nextInt();
				
				int[] elements = new int[nums];
				int[] elementsB = new int[nums];
				int[] elementsI = new int[nums];
				int[] elementsQ = new int[nums];
				int[] elementsM = new int[nums];
				int[] elementsS = new int[nums];

				for (int i = 0; i < nums; i++)
					{
						elements[i] = (int) (Math.random() * 90) + 10;
						// System.out.println(elements[i]);
					}
				
				for (int i = 0; i < nums; i++)
					{
						elementsB[i] = elements[i];
					}
				
				for (int i = 0; i < nums; i++)
					{
						elementsI[i] = elements[i];
					}
				
				for (int i = 0; i < nums; i++)
					{
						elementsQ[i] = elements[i];
					}
				
				for (int i = 0; i < nums; i++)
					{
						elementsM[i] = elements[i];
					}
				
				for (int i = 0; i < nums; i++)
					{
						elementsS[i] = elements[i];
					}

				double startTimeB = System.currentTimeMillis();
				for (int i = 0; i < runs; i++)
					{
						BubbleSort.bubbleSort(elementsB);
					}
				double endTimeB = System.currentTimeMillis();

				double startTimeI = System.currentTimeMillis();
				for (int i = 0; i < runs; i++)
					{
						InsertionSort.insertionSort(elementsI);
					}
				double endTimeI = System.currentTimeMillis();

				double startTimeM = System.currentTimeMillis();
				for (int i = 0; i < runs; i++)
					{
						MergeSort.mergeSort(elementsM, nums);
					}
				double endTimeM = System.currentTimeMillis();

				double startTimeQ = System.currentTimeMillis();
				for (int i = 0; i < runs; i++)
					{
						QuickSort.qsort(elementsQ);
					}
				double endTimeQ = System.currentTimeMillis();

				double startTimeS = System.currentTimeMillis();
				for (int i = 0; i < runs; i++)
					{
						SelectionSort.selectionSort(elementsS);
					}
				double endTimeS = System.currentTimeMillis();

				System.out.println();
				
				double timeB = (endTimeB - startTimeB) / runs;
				double timeI = (endTimeI - startTimeI) / runs;
				double timeM = (endTimeM - startTimeM) / runs;
				double timeQ = (endTimeQ - startTimeQ) / runs;
				double timeS = (endTimeS - startTimeS) / runs;
				
				//numbers.add(new SortingRun("Bubble sort       ", timeB, " milliseconds"));
				//numbers.add(new SortingRun("Insertion sort    ", timeI, " milliseconds"));
				//numbers.add(new SortingRun("Merge sort        ", timeM, " milliseconds"));
				//numbers.add(new SortingRun("Quick sort        ", timeQ, " milliseconds"));
				//numbers.add(new SortingRun("Selection sort    ", timeS, " milliseconds"));
				
				numbers.add(new SortingRun("Bubble sort ", timeB, " milliseconds"));
				numbers.add(new SortingRun("Insertion sort ", timeI, " milliseconds"));
				numbers.add(new SortingRun("Merge sort ", timeM, " milliseconds"));
				numbers.add(new SortingRun("Quick sort ", timeQ, " milliseconds"));
				numbers.add(new SortingRun("Selection sort ", timeS, " milliseconds"));
				
				Collections.sort(numbers, new timeSorter());
				int place = 1;
				for(SortingRun t:numbers)
					{
						System.out.printf(place + "." + t.getTypeSort() + t.getTime() + t.getSeconds());
						place++;
					}


			}

	}
