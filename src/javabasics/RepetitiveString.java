package javabasics;

import java.util.HashMap;
import java.util.Map;

public class RepetitiveString {

	public static void main(String[] args) {

		String str = "rahul patidar rahul is my is";
		String ar[] = str.split(" ");
		
		Map<String, Integer>map=new HashMap<>();
		
		for(int i=0; i< ar.length; i++) {
			int count=0;
			
			for (int j = 0; j < ar.length; j++) {
				
				if (ar[i].equals(ar[j])) {
					count++;
				}
				map.put(ar[i], count);
			}
		}
		System.out.println(map);
	}

}
