package com.bankofamerica.userdefinedexception;

public class WorkingVisa {
	
	public static void eligibility(String visa) throws InvalidVisaException { 
		
     
     if(  visa.equals("h4")) {
    	 throw new InvalidVisaException();
    	 
     }else {
    	 System.out.println("working visa");
     }
}
	
	public static void main(String[] args) {
		try {
			eligibility(null);
		} catch (InvalidVisaException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch(Exception n) {
			n.printStackTrace();
		}
		System.out.println("===========");
	}
	}
