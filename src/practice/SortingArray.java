package practice;

public class SortingArray {

	public static void flip(int array[],int x,int y) {
		int temp;
		temp= array[x];
		array[x]=array[y];
		array[y]=temp;
		
		
	}
	
	
	public static void main(String[] args) {
		
	
		
		//int[] array=DataProvider.getData();
		int array[]= {1,10,8,7,6,5};
		
		//sorting
		for(int i=0; i<array.length;i++){
			//fixing position for i'th item
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					flip(array, i, j);
					
				}
				
			}
			
		}

		//DataProvider.printArray(array);
		//now printing array
		for(int x:array) {
			System.out.print(x + " ");
		}
		System.out.println();
		

	}
	

}
