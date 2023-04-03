package practice;

import java.util.Scanner;

public class AddTwoMatrix {
	public static void main(String[] args) {

		int[][] a = new int[2][2];
		int[][] b = new int[2][2];
		int[][] c = new int[2][2];

		Scanner r = new Scanner(System.in);

		System.out.print("enter first matrix Data");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = r.nextInt();

			}

		}
		System.out.print("enter second matrix Data");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				b[i][j] = r.nextInt();

			}

		}

		System.out.println("First matrix \n");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(a[i][j] + " ");

			}
			System.out.print("\n");

		}
		System.out.println("Second matrix \n");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(b[i][j] + " ");

			}
			System.out.print("\n");

		}
		System.out.println("sum of two matrix");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");

			}
			System.out.print("\n");// code from "learn coding"
		}
	}

}
