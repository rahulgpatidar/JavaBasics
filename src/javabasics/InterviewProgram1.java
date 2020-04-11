package javabasics;

public class InterviewProgram1 {

	
	
	public static void main(String[] args) {

	
		int a = 12;
		int b = 34;
		//int output = 1324;

		String s1 = String.valueOf(a);
		char c1[] = s1.toCharArray();

		String s2 = String.valueOf(b);
		char c2[] = s2.toCharArray();
		
		System.out.println(c1[0]+""+c2[0]+""+c1[1]+""+c2[1]);
		
		/*
		 * for (int i = 0; i < c1.length; i++) { for (int j = 0; j < c2.length; j++) {
		 * System.out.println(c1[i]+""+c2[j]); } }
		 */
	}

}
