package javabasics;

public class SmallestInArray {
	public static void main(String[] args) {

		int a[] = { 4, 25, 7, 25, 41, 23, 25, 42,42};

		int smallest = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] < smallest) {

				smallest = a[i];
			}
		}
		System.out.println(smallest);

	}
}