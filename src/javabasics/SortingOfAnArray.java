package javabasics;

public class SortingOfAnArray {

	public static void main(String[] args) {
		int a[] = { 3, 7, 2, 9, 1, 44, 31 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
	}
}
