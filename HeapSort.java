/*
 * Preston McIllece and Wenning Jiang's Lab13
 * 
 * This class implements an algorithm for sorting a list by using a heap
 */

public class HeapSort <T extends Comparable<? super T>> extends SortingAlgorithm <T> {

	//default constructor
	public HeapSort() {
		
	}
	
	//sorts the given array
	@Override
	public void sort(T[] array) {
		// TODO Auto-generated method stub
		MaxHeap heap = new MaxHeap();
		
		//adds the array elements to the heap
		for (int i = 0; i < array.length; i++) {
			heap.add(array[i]);
		}
		//removes elements from the heap and adds them in reverse order 
		//so that the largest elements are at the back and 
		for (int i = heap.getSize() - 1; i >= 0; i--) {
			array[i] = (T) heap.remove();
		}
		
		
	}

}
