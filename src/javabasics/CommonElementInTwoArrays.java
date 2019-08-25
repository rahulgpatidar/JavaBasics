package javabasics;

public class CommonElementInTwoArrays {

	public static void main(String[] args) {
		int a[] = { 3, 7, 2, 9, 1, 44, 31 };
		int b[] = { 7, 8, 1, 10, 44 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
					// System.out.println(b[j]);
				}
			}
		}
	}

}
