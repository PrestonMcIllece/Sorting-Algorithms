/*
 * Preston McIllece and Wenning Jiang's Lab12
 * 
 * This class contains a main method to run the different sorting algorithms
 * and compare their run times
 */
public class TimeSorts {

	public TimeSorts() {
		// TODO Auto-generated constructor stub
	}

	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//runs trials of size 25,000, 50,000, 75,000, and 100,000
		//on all of the different sorting algorithms
		for (int i = 25000; i <= 100000; i += 25000) {
			SortingAlgorithm.compareSorts(i);
		}
	}

}
