package javabasics;

public class PallindromString {

	public static void main(String[] args) {
		
		String str="rar";
		String rev=new StringBuffer(str).reverse().toString();
		
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("string is pallindrom");
		}
		else
			System.out.println("not pallindrom");
	}

}
