package javabasics;

import java.util.HashMap;
import java.util.Map;

public class RepetitiveCharacter2 {

	public static void main(String[] args) {

		String str = "rahulpatidar";
		char c[] = str.toCharArray();
		
		Map<Character, Integer>map=new HashMap<>();
		
		for(int i=0; i< c.length; i++) {
			int count=0;
			
			for (int j = 0; j < c.length; j++) {
				
				if (c[i]==c[j]) {
					count++;
				}
				map.put(c[i], count);
			}
		}
		System.out.println(map);
	}

}
