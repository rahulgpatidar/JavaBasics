package javabasics;

public class SecondLargestInArray {
	public static void main(String[] args) {

		int a[] = { 4, 25, 7, 25, 41, 23, 25,42 };

		int largest = a[0];
		int secondLargest = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			} else if (a[i] > secondLargest) {
				secondLargest = a[i];
			}
		}
		System.out.println(secondLargest);

	}
}