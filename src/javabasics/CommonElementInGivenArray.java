package javabasics;

public class CommonElementInGivenArray {

	public static void main(String[] args) {
		int a[] = { 3, 7, 2, 3, 1, 44, 31, 7, 44 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
