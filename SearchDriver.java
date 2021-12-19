public class SearchDriver{
	static int size = 10000;
	static long elapsedTime;

	static Comparable[] array = makeArray(size);

	public static Comparable[] makeArray(int size){
		Comparable[] array = new Comparable[size];
		for(int i=0;i<size;i++){
			array[i] = i;
		}
		return array;
	}

	public static long binTime() {
		long time_before = System.currentTimeMillis();

		for(Comparable target : array) {
			BinSearch.binSearch(array, target);
		}

		long time_after = System.currentTimeMillis();

		elapsedTime = time_after - time_before;

		return elapsedTime;
	}

	public static double binaryAvgTime() {
	    return (double)(elapsedTime) / size;
	}

	public static long linTime() {
		long time_before = System.currentTimeMillis();

		for(Comparable target : array) {
			LinSearch.linSearch(array, target);
		}

		long time_after = System.currentTimeMillis();

		elapsedTime = time_after - time_before;

		return elapsedTime;
	}

	public static double linearAvgTime() {
    	return (double)(elapsedTime) / size;
  	}

	public static void main(String[] args){
		System.out.println("Time elapsed for " + size + " Binary searches on " + size + " elements: " + binTime());
		System.out.println("Average time per search: " + binaryAvgTime() + " milliseconds" + "\n");
		System.out.println("Time elapsed for " + size + " Linear searches on " + size + " elements: " + linTime());
		System.out.println("Average time per search: " + linearAvgTime() + " milliseconds" + "\n");

	}
}
