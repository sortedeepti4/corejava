package practice;

public class FindMaximum {
	public static void findMaximum() {
		//find maximum and minimum value in array	
		int array1[]= {4,6,3,11,66,9};
		
		int max=array1[0];//4
		int min= array1[0];//4
		int index=0;
		
		for(int i=0;i<array1.length;i++) {
			if(array1[i]<min) {
				min=array1[i];
				
				}
			
			if(array1[i]>max) {
				max= array1[i];
				index=i;
			}
			
		}
		System.out.println("minimum: " +min+" maximum: " +max);
		System.out.println("index of largest value of array is: "+index);
		
	}
	
	public static void main(String[] args) {
		findMaximum();
	}
}
