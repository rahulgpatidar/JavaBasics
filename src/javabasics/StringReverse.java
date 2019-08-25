package javabasics;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Rahul Patidar";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);

		StringBuffer sf = new StringBuffer(str);
		System.out.println(sf.reverse());

		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
	}
}
