package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {

		int a = 10;
		System.out.println(a);
		// Array

		int x[] = { 10, 20, 30, 40, 50, 60 };
		int size = x.length; // predefine
		for (int i = 0; i < size; i++) {
			System.out.println(x[i]);
		}
		System.out.println("==================");

		for (int y : x) {// another way to write array,by using for-each
			System.out.println(y);
		}
		String name1 = "deepti";// regular string.
		String name[] = { "antony", "raja", "tony", "dipti","sony","mony"};// string array
		
		for (int i = 0; i < size; i++) {
			System.out.println(name[i]);
			}
		
		for (int i = 0; i < name.length; i++) {
			if(i==0||i==5) {
			System.out.println(name[i]+"====");
			}
			
			}
		char javachararray[]= {'a','b','c','d','e'};
		
		System.out.println(javachararray.length);//length of array
		int size1= javachararray.length;
		
		for(int i=0; i < size1;i++) {
			System.out.println(javachararray[i]);
		}
		
		
		char chararray[]= {'e','c','d','b','a','f'};// arrays.sort() use for sorting.
		
		Arrays.sort(chararray);// sort in ascending order.
		
		System.out.println(Arrays.toString(chararray));
		
		
		String value= "hello deepti";
		char array[]= value.toCharArray();//tocharArray() use to convert string to char.
		
		for(char c:array) {
			System.out.println(c);
		}
		
		
		
		
		
}
	}