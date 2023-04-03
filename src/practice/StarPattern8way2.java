package practice;

public class StarPattern8way2 {
	public static void main(String[] args) {
		int maxRow=6;
		
		for(int row=1;row<maxRow; row++) {
			for(int column= 1;column<=row;column++) {
				if(column==row) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
