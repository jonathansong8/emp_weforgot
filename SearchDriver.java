import java.net.BindException;

public class SearchDriver{
	static int size = 10_000_000;
	static int targetNumber = 1000;

	static Comparable[] array = makeArray(size);
	static Comparable[] targets = makeTargets(targetNumber, size);

	public static Comparable[] makeArray(int size){
		Comparable[] array = new Comparable[size];
		for(int i=0;i<size;i++){
			array[i] = i;
		}
		return array;
	}

	public static Comparable[] makeTargets(int targets, int size) {
		Comparable[] array = new Comparable[targets];
		for(int i=0;i<targets;i++){
			array[i] = (int)(Math.random() * size);
		}
		return array;
	}

	public static long binTime(){
		long time_before = System.currentTimeMillis();

		for(Comparable target : targets) {
			BinSearch.binSearch(array, target);
		}

		long time_after = System.currentTimeMillis();

		return (time_after - time_before);
	}
	public static void main(String[] args){
		System.out.println("Time elapsed for " + targetNumber + " Binary searches on " + size + " elements: " + binTime());
	}
}
