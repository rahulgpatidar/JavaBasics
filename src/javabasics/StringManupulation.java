package javabasics;

public class StringManupulation {

	public static void main(String[] args) {
		String str = "Rahul Patidar";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(1));
		System.out.println(str.contains("l"));
		System.out.println(str.endsWith("r"));
		System.out.println(str.equalsIgnoreCase("rahul patidar"));
		System.out.println(str.equals("rahul patidar"));
		System.out.println(str.indexOf("P"));
		System.out.println(str.indexOf(" "));
		System.out.println(str.isEmpty());
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.length());
		System.out.println(str.replace('a', 'f'));
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 5));

		String s = "   rahul   patidar    ";
		System.out.println(s.trim());

		char c[] = str.toCharArray();
		System.out.println(c.length);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
