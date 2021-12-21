public class SearchDriver{

	static int repetitions = 100;
	static double[] binaryTimes =  new double[repetitions];
	static double[] linearTimes =  new double[repetitions];
	
	static int size = 60000000; 
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

	public static long linWorst() {
		long time_before = System.currentTimeMillis();

		for(int i = 0; i < repetitions; i++) {
			LinSearch.linSearch(array, size - 1);
		}

		long time_after = System.currentTimeMillis();

		return (time_after - time_before) / repetitions;
	}

	public static long binWorst() {
		long time_before = System.currentTimeMillis();

		for(int i = 0; i < repetitions; i++) {
			BinSearch.binSearch(array, size - 1);
		}

		long time_after = System.currentTimeMillis();

		return (time_after - time_before) / repetitions;
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

		System.out.println(binWorst());
		System.out.println(linWorst());

		/*
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
		*/

	}
}
