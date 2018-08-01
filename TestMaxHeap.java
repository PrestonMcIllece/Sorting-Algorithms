/*
 * Preston McIllece and Wenning Jiang's Lab13
 * 
 * Unit test for the MaxHeap
 */
import org.junit.Test;

import junit.framework.TestCase;

public class TestMaxHeap extends TestCase {


	@Test
	public void testAdd() {
		HeapInterface heap = new MaxHeap(5);

		heap.add(17);

		assertEquals(17, heap.front());

		heap.add(23);
		heap.add(5);
		heap.add(30);
		heap.add(13);

		//checks if ensure capacity works
		heap.add(2);

		//checks if size works
		assertEquals(6, heap.getSize());
	}


	@Test
	public void testRemove() {
		HeapInterface heap = new MaxHeap();
		heap.add(17);
		heap.add(23);
		heap.add(5);
		heap.add(30);
		heap.add(13);
		heap.add(2);
		heap.add(14);
		heap.add(0);
		
		assertEquals(30, heap.remove());
		assertEquals(23, heap.remove());
		assertEquals(17, heap.remove());
		
		
		assertEquals(5, heap.getSize());
		
		assertEquals(14, heap.front());
		
		assertFalse(heap.isEmpty());
	}
	
	@Test
	public void testFront() {
		HeapInterface heap = new MaxHeap();
		heap.add(17);
		
		assertEquals(17, heap.front());
		
		heap.add(23);
		heap.remove();
		
		assertEquals(17, heap.front());
		
		heap.add(5);
		heap.remove();
		
		assertEquals(5, heap.front());
	}
	
	@Test
	public void testIsEmpty() {
		HeapInterface heap = new MaxHeap();
		
		assertTrue(heap.isEmpty());
		
		heap.add(17);
		
		assertFalse(heap.isEmpty());
		
		heap.remove();
		
		assertTrue(heap.isEmpty());
	}
	
	
	@Test
	public void testGetSize() {
		HeapInterface heap = new MaxHeap();
		
		assertEquals(0, heap.getSize());
		
		heap.add(17);
		heap.add(23);
		heap.add(5);
		heap.add(30);
		
		assertEquals(4, heap.getSize());
		
		heap.remove();
		heap.remove();
		
		assertEquals(2, heap.getSize());
		
		heap.add(2);
		
		assertEquals(3, heap.getSize());
	}
}


	
	

