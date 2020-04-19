package javabasics;

import java.util.Arrays;

public class RemovefirstrepeatedNumberinArray {

	public static void main(String[] args) {
		int c =0;
		int[] a = { 1, 2, 3, 4, 5, 1 };
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			int counter = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j])
					counter++;
			}
			if (counter > 1) {
				System.out.println("Repeated Number : " + n);
				c = n;
				break;
			}
		}
		a = ArrayUtils.remove(a, c);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

}
