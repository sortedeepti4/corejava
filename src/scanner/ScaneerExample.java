package scanner;

import java.util.Scanner;

public class ScaneerExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name"); 
		
		String name = scan.nextLine();
		
		System.out.println("Enter your age");
		
		int age = scan.nextInt();
		
		System.out.println("Enter your salary");
		
		float salary = scan.nextFloat();
		
		System.out.println("=====print your data======");
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);

	}

}
