/*
 * Preston McIllece and Wenning Jiang's Lab12
 * 
 * This abstract class implements the apply method from the Algorithm class.
 * It also is the basis for any sorting algorithm
 */
public abstract class SortingAlgorithm <T extends Comparable <? super T>> extends Algorithm <T> {

	//unused constructor
	public SortingAlgorithm() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * sorts the parameter array in ascending order (from smallest to largest) 
	 */ 
	public abstract void sort (T[] array);
	
	/**
	 * Invoke the appropriate sorting algorithm.
	 */
	public void apply(T[] array) {
	    this.sort(array);
	}
	
	//checks if a list is sorted
	public static <T extends Comparable<? super T>> boolean isSorted(Comparable[] array) {
		boolean returnValue = true;
		for (int i = 0; i < array.length - 1; i++) {
			int compareValue = array[i].compareTo(array[i + 1]);
			if (compareValue > 0)
				returnValue = false;
				
		}
		return returnValue;
	}
	
	/** Task: Swaps the array elements a[i] and a[j].
	 *  @param a  an array of objects
	 *  @param i  an integer >= 0 and < a.length
	 *  @param j  an integer >= 0 and < a.length */
	protected static void swap(Object[] a, int i, int j)
	{
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp; 
	} 

	//compares the amount of time it takes to sort a list using different algorithms
	public static void compareSorts(int n) {
		final int NUMBER = 5;
		SortingAlgorithm[] sorts = new SortingAlgorithm[NUMBER];

		sorts[0] = new SelectionSort();
		sorts[1] = new InsertionSort();
		sorts[2] = new MergeSort();
		sorts[3] = new QuickSort();
		sorts[4] = new HeapSort();

		Integer[][] sortArray = new Integer[NUMBER][n];
		sortArray[0] = createRandomArray(n);

		System.arraycopy(sortArray[0], 0, sortArray[1], 0, sortArray[0].length);
		System.arraycopy(sortArray[0], 0, sortArray[2], 0, sortArray[0].length);
		System.arraycopy(sortArray[0], 0, sortArray[3], 0, sortArray[0].length);
		System.arraycopy(sortArray[0], 0, sortArray[4], 0, sortArray[0].length);
		
		for (int i=0; i < sorts.length; i++) {
			
				System.out.println(sorts[i].time(sortArray[i]));
			}
			// anything you need to do to report statistics
		}
	
	
}
