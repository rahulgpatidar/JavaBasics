package javabasics;

public class DataConversion {

	static String s="100";
	static int a=10;
	
	public static void main(String[] args) {

		//These(Integer,Double,Character,Boolean....) are the wrapper classes, which is used to type conversion
		System.out.println(s+a); //10010
		int s1=Integer.parseInt(s);
		System.out.println(s1+a); //110
		
		String y="100a";
		int x=20;
		/*
		 * int y1=Integer.parseInt(y);//NumberFormatException
		 *  System.out.println(y1+x);
		 */
		
		String z=String.valueOf(x);
		System.out.println(y+z);
	}

}
