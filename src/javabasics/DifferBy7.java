package javabasics;

public class DifferBy7 {
	static int c = 0, i = 0;
	static int x, y, z;

	public static void main(String[] args) {
		int[] a = { 5, 1, 8, 9 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if ((a[i] - a[j]) == 7) {
					System.out.println("Match Found !!");
					System.out.println("X= " + a[i]);
					System.out.println("Y= " + a[j]);
				}
			}
		}
	}
}
