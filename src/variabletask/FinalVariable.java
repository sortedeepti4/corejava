package variabletask;

public class FinalVariable {
	
	final int n=100;
	final int m=100;
	final int l=0;
	
	public void add() {
		final int l=n+m;
		System.out.println(l);
		
	}
	
	public static void main(String[] args) {
		FinalVariable finalvariable = new FinalVariable();
		finalvariable.add();
	
	}

}
