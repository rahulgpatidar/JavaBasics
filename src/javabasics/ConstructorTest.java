package javabasics;

public class ConstructorTest {

	String name;
	int age;

	/**
	 * If we will not write constructor, there is hidden constructor which is
	 * default and created by java at runtime. We can overload constructor. When
	 * will create an object Constructor will be called automatically
	 */
	public ConstructorTest() {
		System.out.println("test constructor");
	}

	public ConstructorTest(int a) {
		System.out.println("test overloaded constructor");
		System.out.println(a);
	}

	/**
	 * with help of Class variable will create one constructor. if we want to use
	 * class variable,we have to use "this" keyword and. with the help of "this" we
	 * are initializing class variable ex. this.classVariable=local variable
	 */
	public ConstructorTest(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public void test() {
		System.out.println("test method");
	}

	public static void main(String[] args) {

		// below one give "test constructor" output
		ConstructorTest c = new ConstructorTest();

		// below one give "test overloaded constructor" and 10 as output
		ConstructorTest c1 = new ConstructorTest(10);

		ConstructorTest t = new ConstructorTest("Rahul", 25);
		System.out.println(t.name);
		System.out.println(t.age);

	}

}
