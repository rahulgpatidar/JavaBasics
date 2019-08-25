package javabasics;

public class MethodOverloading {

	/* In method overloading : 
	 * method name should be same , but there should be difference on Sequesnce od parameter
	 * /Type of parameter/Number of parameter
	 * return type does not matter on method overloading
	 * Used to enhance the readability and code cleaness
	 * Main method can be overloaded
	 * Constructor can be overloaded
	 * */
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.test();
		m.test(10);
		m.test(2, 3);
	}

	public void test() {
		System.out.println("test");
	}
	public void test(int a, int b) {
		System.out.println(a+b);
	}
	public int test(int a) {
		System.out.println(a);
		return a;
		//we can not use syso after return statement
		//System.out.println("ad");
	}
}
