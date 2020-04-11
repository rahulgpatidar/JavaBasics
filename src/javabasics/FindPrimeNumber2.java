package javabasics;

public class FindPrimeNumber2 {
	static int no = 19;
	static int i = 0;

	public static void main(String args[]) {
		if (no == 1) {
			System.out.println("Smallest Prime number is 2");
		}
		for (i = 2; i < no; i++) {
			if (no % i == 0) {
				System.out.println("Not Prime");
				break;
			}
		}
		if (no == i) {
			System.out.println("Prime");
		}

	}
}
