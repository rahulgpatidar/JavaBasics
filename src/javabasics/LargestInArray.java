package javabasics;

public class LargestInArray {
	public static void main(String[] args) {

		int a[] = { 4, 25, 7, 25, 41, 23, 25, 42,42};

		int largest = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > largest) {

				largest = a[i];
			}
		}
		System.out.println(largest);

	}
}