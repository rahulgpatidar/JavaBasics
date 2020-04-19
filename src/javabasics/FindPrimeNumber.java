package javabasics;

public class FindPrimeNumber {

	public static void main(String args[]) {
		int num = 10; 
		int count = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.print("This is a Prime Number");
		} else {
			System.out.print("This is not a Prime Number");
		}
	}
}
