package javabasics;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateInGivenArray {

	public static void main(String[] args) {

		int a[] = { 2, 1, 4, 2, 5, 3, 7, 2, 1, 5 };
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					if (!list.contains(a[i])) {
						list.add(a[i]);
					}
				}

			}
		}
		System.out.println(list);
	}
}
