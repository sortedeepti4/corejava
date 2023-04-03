package garbagecollector;

public class GarbageCollector {
	
	public static void display() {
		GarbageCollector gc4= new GarbageCollector();//3. creating object inside method	
	}
    public static void main(String[] args) {
		
    	GarbageCollector gc1= new GarbageCollector();
    	GarbageCollector gc2= new GarbageCollector();
    	GarbageCollector gc3= new GarbageCollector();
    	
    	//gc1=null;eligibility for garbage collction 1.nullifying
    	
    	gc2=gc1;// 2. reassigning reference
    	
    	display();
    	
    	System.gc();
    	
    	//factory method
    	
    	Runtime r= Runtime.getRuntime();
    	r.gc();
    	
	}
}
