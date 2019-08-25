package javabasics;

public class Test {

	public static void main(String[] args) {
		
		int n=123;
		int rev=0;
		while (n>0) {
			n=n/10;
			rev=n+rev*10;
			n=n%10;
		}
		System.out.println(rev);
	}
}
