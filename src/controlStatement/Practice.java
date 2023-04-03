package controlStatement;

import java.util.ArrayList;

public class Practice {
	
	
	public static void printEvenNo(int max) {
	//	System.out.println("Printing even no:"+);
		int i=0;
		int evensum= 0;
		int oddsum=0;
		ArrayList arraylistEven= new ArrayList();
		ArrayList arraylistOdd= new ArrayList();
		while(i<=max) {
			if(i %2==0) {			
				
				arraylistEven .add(i);
				evensum= evensum+i;
				
			}else {
				arraylistOdd.add(i);
				oddsum= oddsum +i;
			}
			i++;
			
		}
		for ( i = 0; i < arraylistEven.size(); i++) {
            System.out.print(arraylistEven.get(i) + " ");
        }
		System.out.println();
		for ( i = 0; i < arraylistOdd.size(); i++) {
            System.out.print(arraylistOdd.get(i) + " ");
        }
		System.out.println();
		System.out.println(arraylistEven);
		System.out.println(arraylistOdd);
		System.out.println(evensum );
		System.out.println(oddsum );
	}
	public static void print1To100(int input) {
		System.out.println("Printing upto :"+input);
		for(int i=1; i<=input;i=i+2) {			
			System.out.println(i);
		}
	}
	//Java program to print All ASCII Letters
	public static void printAToZasciivalue() {
		
		for(int i=65; i<=90;i++) {
			
			System.out.println("the ascii value of "+(char)i+"="+i);
			
		}
	}
	
	public static void main(String[] args) {
		int m=10;
		print1To100(m);
		print1To100(2);
		print1To100(100);
		
		printEvenNo(500);
		
		printAToZasciivalue();
		
		
		//Java program to print the reverse of a given number
		int n= 121;
		int r;
		while(n>0) {
			r= n%10;
			System.out.print(r);
			n=n/10;
		}
		
	}

}
