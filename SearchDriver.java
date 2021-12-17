public class SearchDriver{
	public static Comparable[] makeArray(int size){
		Comparable[] arr = new Comparable[size];
		for(int i=0;i<size;i++){
			arr[i] = i;
		}
		return arr;
	}

	public static long binTime(Comparable[] arr, int searcher){
		long time_before=System.currentTimeMillis();

		BinSearch.binSearch(arr,searcher);
		long time_after=System.currentTimeMillis();

		return time_after-time_before;
	}
	
	public static void main(String[] args){
		Comparable[] array = makeArray(100000000);
		System.out.println(binTime(array, 100));
	}
}
