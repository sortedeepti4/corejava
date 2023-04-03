package controlStatement;

public class PracticeControlStatement {
	public static void main(String[] args){//Program to swap two numbers[with and without third variable]
		int x= 25;
		int y= 23;
		System.out.println("x="+x+" "+"y="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x="+x+" "+"y="+y);//without third variable
		
		int a= 300;
		int b= 400;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a+" and b="+b);
		
		
		System.out.println("===== print 1-100 loop==============");//print 1-100 without loop
		
		for(int i=0;i<=100;i++){
			
			System.out.println(i);
			
			
		}
		
		
		System.out.println("===== print 1-100 without loop==============");
		
		
		
		int number=1;
		printnumber(number);
		
		//. Write a program to calculate the sum of first 10 natural number
		int i;
		int sum = 0;
		int num = 10;
		for(i=0;i<=10;++i) {
			sum= sum+i;
		}
	    System.out.println("sum of first 10 no is ="+sum);
	}
	public static void printnumber(int num) {
		// method calling itself is called recursion.
		//it is equivalent to loop.
		if(num<=100) {
			System.out.println(num);
			printnumber(num+1);
		}	
	}
	
	
	
	
}

