package practice;

public class DataProvider {
	public static int[] getData() {
		int array[]= {1,10,8,7,6,5};
		return array;
	}
	
	public static void printArray(int array[]) {
		for(int x:array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
