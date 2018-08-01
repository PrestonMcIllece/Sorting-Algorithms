/*
 * Preston McIllece and Wenning Jiang's Lab13
 * 
 * Implementation of a Priority Queue so that the heap prioritizes certain elements
 */

public class PriorityQueue<T extends Comparable<? super T>> implements Queue<T> {
 
	HeapInterface heap;

	//default constructor
	public PriorityQueue() {
		// TODO Auto-generated constructor stub
		heap = new MaxHeap();
	}

	//add method
	@Override
	public void add(T item) {
		// TODO Auto-generated method stub
		heap.add(item);
	}

	//remove method
	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return (T) heap.remove();
	}

	//checks if the heap is empty
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return heap.isEmpty();
	}

	//gets the size of the heap
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return heap.getSize();
	}

}
