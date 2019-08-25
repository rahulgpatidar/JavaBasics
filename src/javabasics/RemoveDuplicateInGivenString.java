package javabasics;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateInGivenString {

	public static void main(String[] args) {
		String str = "rahulpatidar";
		char c[] = str.toCharArray();
		List<Character> list = new ArrayList<Character>();

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (c[i] == c[j]) {
					if (!list.contains(c[i])) {
						list.add(c[i]);
					}
				}
			}
		}
		System.out.println(list);

	}
}
