public class SearchDriver{

	static int repetitions = 100;
	static double[] binaryTimes =  new double[repetitions];
	static double[] linearTimes =  new double[repetitions];
	
	static int size = 5000; 
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

	public static long linTime() {
		long time_before = System.currentTimeMillis();

		for(Comparable target : array) {
			LinSearch.linSearch(array, target);
		}

		long time_after = System.currentTimeMillis();

		elapsedTime = time_after - time_before;

		return elapsedTime;
	}

	public static double timePerSearch() {
    	return (double)(elapsedTime) / size;
  	}
	
	public static double avgTimes(double[] times) {
		double sum = 0;
		for(double time : times) {
			sum += time;
		}
		return sum / repetitions;
	}

	public static void main(String[] args){

		for(int i = 0; i < repetitions; i++) {
			binTime();
			binaryTimes[i] = timePerSearch();
		}

		System.out.println(avgTimes(binaryTimes));

		for(int i = 0; i < repetitions; i++) {
			linTime();
			linearTimes[i] = timePerSearch();
		}

		System.out.println(avgTimes(linearTimes));

		/*
		System.out.println("Time elapsed for " + size + " Binary searches on " + size + " elements: " + binTime() + " milliseconds");
		System.out.println("Average time per search: " + timePerSearch() + " milliseconds" + "\n");
		System.out.println("Time elapsed for " + size + " Linear searches on " + size + " elements: " + linTime() + " milliseconds");
		System.out.println("Average time per search: " + timePerSearch() + " milliseconds" + "\n");
		*/

	}
}
