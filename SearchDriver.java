public class SearchDriver{
	static int size = 100000;
	// static int targetNumber = 1000;

	static Comparable[] array = makeArray(size);
	//static Comparable[] targets = makeTargets(targetNumber, size);

	public static Comparable[] makeArray(int size){
		Comparable[] array = new Comparable[size];
		for(int i=0;i<size;i++){
			array[i] = i;
		}
		return array;
	}
/*
	public static Comparable[] makeTargets(int targets, int size) {
		Comparable[] array = new Comparable[targets];
		for(int i=0;i<targets;i++){
			array[i] = (int)(Math.random() * size);
		}
		return array;
	}
*/
  // creates array of random numbers


	public static long binTime() {
		long time_before = System.currentTimeMillis();

		for(Comparable target : array) {
			BinSearch.binSearch(array, target);
		}

		long time_after = System.currentTimeMillis();

		return (time_after - time_before);
	}

	public static double binaryAvgTime() {
	    return (double)(binTime()) / size;
	  }

	public static long linTime() {
		long time_before = System.currentTimeMillis();

		for(Comparable target : array) {
			LinSearch.linSearch(array, target);
		}

		long time_after = System.currentTimeMillis();

		return (time_after - time_before);
	}

	public static double linearAvgTime() {
    		return (double)(linTime()) / size;
  	}

	public static void main(String[] args){
		System.out.println("Time elapsed for " + size + " Binary searches on " + size + " elements: " + binTime());
		System.out.println(binaryAvgTime());
		System.out.println("Time elapsed for " + size + " Linear searches on " + size + " elements: " + linTime());
		System.out.println(linearAvgTime());

	}
}
