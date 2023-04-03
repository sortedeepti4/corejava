package encapsulation;

public class Arithmatic {
	public void addPublic() {
		System.out.println("addPublic");
	}
	
	private void addPrivate() {
		System.out.println("addPrivate");
	}
	
	protected void addProtected() {
		System.out.println("addProtected");
	}
	 void addDefault() {
		System.out.println("addDefault");
	}
	 public static void main(String[] args) {
		
		 Arithmatic ao = new Arithmatic();
		 ao.addPublic();
		 ao.addProtected();
		 ao.addPrivate();
		 ao.addDefault();
		 
	}
	

}
