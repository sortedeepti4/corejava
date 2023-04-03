package practice;

public class FindIndex {
	public static int findIndex(String colorInput) {
		//find index of element in array in java
				String[]color= {"red","orange","yellow","blue"};
				int index=0;
				
				for(int i=0;i<color.length;i++) {
					if(color[i]==colorInput) {
						index=i;
					}
					
				}
				return (index);
	}
	
	public static void main(String[] args) {
		int xx=findIndex("orange");
		findIndex("blue");
		System.out.println(xx);
		System.out.println(findIndex("blue"));
		
	}
}
