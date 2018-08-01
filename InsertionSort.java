/*
 * Preston McIllece and Wenning Jiang's Lab12
 * 
 * This class creates an algorithm for the insertion sort way of sorting a list
 */
public class InsertionSort <T extends Comparable<? super T>> extends SortingAlgorithm <T> {

	//unused constructor
	public InsertionSort() {
		// TODO Auto-generated constructor stub
	}
	
	//implements the abstract sort method from the SortingAlgorithm class
	//this method implements the insertion sort way of sorting
	public void sort(T[] array) {
		for (int i = 1; i < array.length; i++) {
			 T key = array[i];
			 int j = i - 1;

			 while (j >= 0 && array[j].compareTo(key) > 0) {
			        array[j+1] = array[j];
			        j--;
			 }

			 array[j+1] = key;
		}
	}

}
