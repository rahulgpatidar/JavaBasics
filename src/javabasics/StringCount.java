package javabasics;

import java.util.HashMap;
import java.util.Map;

public class StringCount {

	public static void main(String[] args) {

		String str = "My name is Rahul and Rahul is my identity";
		String s[] = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < s.length; i++) {
			int count = 0;
			for (int j = 0; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					count++;
				}
				map.put(s[i], count);
			}
		}
		System.out.println(map);
	}
}
