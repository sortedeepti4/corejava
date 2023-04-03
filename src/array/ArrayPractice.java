package array;

public class ArrayPractice {
	public static void flip(int array[],int x,int y) {
		int temp;
		temp = array[x];
		array[x]=array[y];
		array[y]=temp;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					flip(array, x, y);
				}
			}
		}
		
		}
	public static void findMaxAndMin(int[ ] array) {
		int largest= array[0];
		int smallest= array[0];	
		
		for(int i=0;i<array.length;i++) {
			
			if(largest<array[i]) {
				
				largest=array[i];
				}
			if(smallest>array[i]) {
				
				smallest=array[i];
				}
			}
		System.out.println("largest no is :"+largest);
		System.out.println("smallest no is :"+smallest);
	}
	public static void main(String[] args) {
		
		//Java program to find the largest number and smallest no in an array
		int array[]= {200,60,30,100,10,20};
		findMaxAndMin(array);
		int array2[]={10,14,25,50,45};
		findMaxAndMin(array2);
		
		
		//findMaxAndMin({10,14,25,50,45});
		
		int numbers[]= {2,3,4,5,1};
		int sum=0;
		
		for(int number:numbers) {
			sum += number;
			}
		System.out.println("sum="+sum);
		System.out.println("================");
		
		
		char vowel[]= {'a','e','i','o','u'};
		int b=0;
		for(char character:vowel ) {
			System.out.println(vowel[b]);
			b++;
		}
		for(int i=0;i<vowel.length;i++) {
			System.out.println(vowel[i]);
		}
		System.out.println("=======================");
		
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2!=0){
				System.out.println("odd number="+numbers[i]);
			}
			
			
		}
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				System.out.println("even number"+numbers[i]);
				
			}
		}
		
		int mixnumbers[]= {200, 60,30,100,10,20};
		int max=0;
		/*for(int i=0;i < mixnumbers.length;i++) {
			if(mixnumbers[i]>max) {
			    max= mixnumbers[i];
			}
			
		}*/
		//System.out.println(max);
		int[] array1= {10,28};
		max= findMaximumOfArray(  mixnumbers  , true);
		max= findMaximumOfArray(  array  , false);
		System.out.println(max);
		
		
	}
	public static int findMaximumOfArray(int[] numbers, boolean print) {
		int max=0;
		for(int i=0;i < numbers.length;i++) {
			if(numbers[i]>max) {
			    max= numbers[i];
			}
			
		}
		if(print) {
			System.out.println(max);
		}
		return max;
	}
	
	

}
