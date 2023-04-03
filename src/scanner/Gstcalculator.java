package scanner;

import java.util.Scanner;

public class Gstcalculator {
	
	public static void main(String[] args) {
		
		System.out.println("GST calculator");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Total Amount");
		
		float totalAmount=scan.nextFloat();
		
		System.out.println("Enter tex");
		int tax=scan.nextInt();
		float totalAmountWithTax= totalAmount +(totalAmount+tax)/100;
		System.out.println(totalAmountWithTax);
		
		
		
		
		
		
	}

}
