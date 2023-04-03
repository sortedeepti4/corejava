package com.bankofamerica.userdefinedexception;

public class Voting {
	
	public static void eligiblity() throws InvalidAgeException{
		
		int age= 17;
		if(age<18) {
			throw new InvalidAgeException();
			//System.out.println("not eligible to voting");
			
		}else {
		
			System.out.println("eligible to vote");
	}
		}
	
	public static void main(String[] args) {
		try {
			eligiblity();
		} catch (InvalidAgeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		int a= 10;
		int b= 20;
		int c= a*b;
		System.out.println(c);
	
	}

}
