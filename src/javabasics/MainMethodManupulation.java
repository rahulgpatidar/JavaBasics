package javabasics;

public class MainMethodManupulation {

	/* return type must be void - main will not return anything, this is the entry point of any program
	 * access specifier must be public
	 * name must be main
	 * parameter must be String[] args
	 * method must be static - no need to create object to call main method, JVM will called without creating object, that's why main is static
	 * main method can be overloaded
	 * main method can't be override because it is static in nature
	 * */
	public static void main(String[] args) {

		System.out.println("Test main method");
		main();
	}

	public static void main() {
		System.out.println("overloaded main method");
	}
}
