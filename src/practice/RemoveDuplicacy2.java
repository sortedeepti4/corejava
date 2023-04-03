package practice;

import java.util.HashSet;

public class RemoveDuplicacy2 {
	//by using Hashset we can remove duplicacy of both sorted and unsorted array
	public static void main(String[] args) {

		int[] a = { 1, 2, 2, 3, 4, 5, 5 };

		HashSet<Integer> hs = new HashSet();

		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);

		}

		for (int no : hs) {
			System.out.print(no + " ");
		}

	}
}
