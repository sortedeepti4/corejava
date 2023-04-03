package logicaloperator;

public class LogicalOROperator {
	
	public static void main(String[] args) {
		
		String username= "deepti";
		
		int age= 15;
		
		if(username.equals("deepti")||age>18) {
			System.out.println("allowed");
			
		}else {
			System.out.println("not allowed");
			
		}
		
	}

}
