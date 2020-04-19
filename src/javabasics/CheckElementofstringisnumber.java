package javabasics;

import java.util.regex.Pattern;

public class CheckElementofstringisnumber {

	public static void main(String[] args) {
		String[] s = { "abc", "123", "xyz" };
		Pattern pattern = Pattern.compile(".*[^0-9].*");
		for (int i = 0; i < s.length; i++)
			System.out.println("Input " + s[i] + " is number :" + !pattern.matcher(s[i]).matches());
	}

}
