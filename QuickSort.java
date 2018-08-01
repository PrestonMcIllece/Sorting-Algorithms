/*
 * Preston McIllece and Wenning Jiang's Lab12
 * 
 * This class implements the quick sort way of sorting a list
 */
public class QuickSort <T extends Comparable<? super T>> extends SortingAlgorithm <T> {

	//unused constructor
	public QuickSort() {

	}

	//implements the abstract sort method from the SortingAlgorithm class
	//calls the quicksort helper method
	public void sort(T [] array) {
		quicksort(array, 0, array.length - 1);
	}

	//private helper method that contains the logic for doing a quick sort
	private void quicksort(T[] a, int left, int right)
	{
		int l = left;
		int r = right;
		T pivot = a[right];

		while (l <= r)
		{
			while (a[l].compareTo(pivot) < 0)
				l++;

			while (a[r].compareTo(pivot) > 0)
				r--;

			if (l <= r)
			{
				swap(a, l, r);

				l++;
				r--;
			}
		}

		// call quick sort recursively
		if (left < r)
			quicksort(a, left, r);

		if (l < right)
			quicksort(a, l, right);
	}
}
