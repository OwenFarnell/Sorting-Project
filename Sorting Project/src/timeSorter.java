import java.util.Comparator;
public class timeSorter implements Comparator<SortingRun>
	{

		public int compare(SortingRun o1, SortingRun o2)
			{
				if(o1.getTime() > o2.getTime())
					
					return 1;
				
				else
					return -1;
					

			}

	}
