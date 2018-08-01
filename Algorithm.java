/*
 * Preston McIllece and Wenning Jiang's Lab12
 * 
 * This abstract class creates the basis for an algorithm
 */
import java.util.Random;

public abstract class Algorithm  < T extends Comparable < ? super T > > {

	//unused constructor
	public Algorithm() {
		// TODO Auto-generated constructor stub
	}

	//abstract method to be defined in a child class
	public abstract void apply(T[] array);

	//method that records the time it takes to run an algorithm
	public long  time(T[] array) {
		long start, end;
		start = System.currentTimeMillis();

		// invoke the apply method
		this.apply(array);

		end = System.currentTimeMillis();

		// returns elapsed time
		return  (end - start);
	}

	/**
	 * Create an array containing n random Integers.
	 */
	public static Integer[] createRandomArray(int n) {
		Integer[] integers = new Integer[n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			integers[i] = random.nextInt();
		}
		return integers;
	}

}
