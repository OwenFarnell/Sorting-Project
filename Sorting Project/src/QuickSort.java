public class QuickSort
	{
		static int[] qsort(int items[])
			{
				qs(items, 0, items.length - 1);
				return items;
			}

		private static void qs(int items[], int left, int right)
			{
				int i, j;
				int pivot, temp;
				i = left;
				j = right;
				pivot = items[(left + right) / 2];

				do
					{
						while ((items[i] < pivot) && (i < right))
							i++;

						while ((pivot < items[j]) && (j > left))
							j--;

						if (i <= j)
							{
								temp = items[i];
								items[i] = items[j];
								items[j] = temp;
								i++;
								j--;
							}
					} while (i <= j);

				if (left < j)
					qs(items, left, j);

				if (i < right)
					qs(items, i, right);
			}
	}
