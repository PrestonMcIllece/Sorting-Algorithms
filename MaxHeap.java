/**
 * MaxHeap.java
 * 
 * Implementation of the HeapInterface as a maximum heap (max heap)
 * 
 * @author [YOUR NAME GOES HERE]
 *
 * @param <T>
 */
public class MaxHeap <T extends Comparable<? super T>> implements HeapInterface<T> {
	private T[] elements;
	private static final int DEFAULT_CAPACITY = 10;
	public int capacity;
	public int numberOfElements;

	public MaxHeap() {
		this(DEFAULT_CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public MaxHeap(int capacity) {
		elements = (T[]) new Comparable[capacity + 1];
		this.capacity = capacity;
	}

	public void add(T item) {
		ensureCapacity();
		numberOfElements++;

		elements[numberOfElements] = item;
		int temp = numberOfElements;
		T parent = elements[(temp)/ 2];
		T child = elements[temp];
		while (temp != 1 && child.compareTo(parent) > 0) {
			elements[temp] = parent;
			elements[(temp)/2] = child;
			temp = temp/2;

			parent = elements[temp/2];
			child = elements[temp];
		}
	}

	public T remove() {
		if (isEmpty()) 
			return null;

		int front = 1;
		T returnValue = elements[1];

		elements[1] = elements[numberOfElements];
		T parent = front();
		T leftChild = elements[front * 2];
		T rightChild = elements[(front * 2) + 1];
		elements[numberOfElements] = null;

		numberOfElements--;
		while (leftChild != null) {
			T worthyChild;
			int worthyIndex;
			if (rightChild != null) {
				if (leftChild.compareTo(rightChild) > 0) {
					worthyChild = leftChild;
					worthyIndex = front * 2;
				}
				else {
					worthyChild = rightChild;
					worthyIndex = front * 2 + 1;
				}
			}
			else  {
				worthyChild = leftChild;
				worthyIndex = front * 2;
			}


			if (worthyChild != null && worthyChild.compareTo(parent) > 0) {
				T tempValue = elements[front];
				elements[front] = elements[worthyIndex];
				elements[worthyIndex] = tempValue;
			}

			front = worthyIndex;
			parent = elements[front];
			
			if (front * 2 > capacity) {
				leftChild = null;
				rightChild = null;
			}
			else if(front * 2 == capacity) {
				rightChild = null;
			}
			else {
			leftChild = elements[front * 2];
			rightChild = elements[front * 2 + 1];
			}

		}

		return returnValue;
	}


	public T front() {
		return elements[1];
	}

	public boolean isEmpty() {
		if (numberOfElements == 0)
			return true;
		return false;
	}

	public int getSize() {
		return numberOfElements;
	}

	private void ensureCapacity() {
		// The following is a starting point
		if (numberOfElements == capacity) {
			elements = java.util.Arrays.copyOf(elements, 2 * elements.length);
			capacity *= 2;
		}
	}
}
