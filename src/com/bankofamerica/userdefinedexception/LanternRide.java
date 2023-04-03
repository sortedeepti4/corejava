package com.bankofamerica.userdefinedexception;

public class LanternRide {
	public static void eligibility()throws WeightException {
		int weight= 35;
		if(weight<45) {
			throw new WeightException();
			//System.out.println("not allow");
		} else {
			System.out.println("are allowed");
		}
	}
	public static void main(String[] args) {
		try {
			eligibility();
		} catch (WeightException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}

}
