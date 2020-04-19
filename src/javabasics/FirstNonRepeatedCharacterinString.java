package javabasics;

public class FirstNonRepeatedCharacterinString {

	public static void main(String[] args) {
		String s = "aabbbcdddd";
		char ch[] = s.toCharArray();
		for (char c : ch) {
			if (s.indexOf(c) == s.lastIndexOf(c)) {
				System.out.println("First non-repeat char = " + c);
				break;
			}
		}
	}

}
