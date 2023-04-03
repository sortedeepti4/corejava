package logicaloperator;

public class LogicalNOToperator {
	
	public static void main(String[] args) {
		
		if(!true) {
			
			System.out.println("true");
			
		}else {
			
			System.out.println("false");
			
		}
		
		if(!false) {
			System.out.println("true");
			
		}else {
			
			System.out.println("false");
			
		}
		
		String country= "India";
		
		if(country != "China") {
			System.out.println("allowed");
			
		}else {
			System.out.println("");
		}
	}

}
