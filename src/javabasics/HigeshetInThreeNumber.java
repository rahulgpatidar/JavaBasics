package javabasics;

public class HigeshetInThreeNumber {

	public static void main(String[] args) {
		int a = 10;
		int b = 94;
		int c = 8;

		if (a > b && a > c) {
			System.out.println("a is highest number");
		} else if (b > c && b > a) {
			System.out.println("b is higest");
		} else {
			System.out.println("c is highest");
		}
	}
}
