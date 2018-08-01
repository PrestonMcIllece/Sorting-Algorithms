/*
 * Preston McIllece and Wenning Jiang's Lab12
 * 
 * This class implements the selection sort method of sorting a list
 */
public class SelectionSort <T extends Comparable<? super T>> extends SortingAlgorithm <T> {
	
	//unused constructor
	public SelectionSort() {
		// TODO Auto-generated constructor stub
	}
	
	//borrows the selection sort method of sorting a list from the GenericComparablesSelectionSort class
	public void sort(T[] array) {
		GenericComparablesSelectionSort.selectionSort(array, array.length);
	}

}
