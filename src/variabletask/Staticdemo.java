package variabletask;

public class Staticdemo {
	public static void main(String[] args) {
		
		Employee sugi= new Employee();
		//sugi.eid= 4;
		//sugi.salary= 4000;
		//sugi.ceo="Mahesh";
		
		
		Employee resh= new Employee();
       // resh.eid=5;
       // resh.salary=5000;
      //  resh.ceo="Mahaesh";
       // resh.ceo="nikita";
        
       // Employee.ceo="nikita"; //static variable call by class name
        
        
        sugi.show();
        resh.show();
		
	}// as ceo is common for all employee, we kept ceo as static variable. so it will shows nikita as ceo for all.s 
	

}
