import java.util.ArrayList;
import java.util.Scanner;

public class SortingRun
	{
		private String typeSort;
		private double time;
		private String seconds;

		
		public SortingRun(String t, double ti, String s)
			{
				typeSort = t;
				time = ti;
				seconds = s;
			}


		public String getTypeSort()
			{
				return typeSort;
			}


		public void setTypeSort(String typeSort)
			{
				this.typeSort = typeSort;
			}


		public double getTime()
			{
				return time;
			}


		public void setTime(double time)
			{
				this.time = time;
			}


		public String getSeconds()
			{
				return seconds;
			}


		public void setSeconds(String seconds)
			{
				this.seconds = seconds;
			}



		

	}
