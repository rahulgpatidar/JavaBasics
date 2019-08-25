package javabasics;

//Interface can not be private/protected, either it will be public or default
//Class which implement Interface must need to override all the methods of Interface

public interface InterfaceTest {

	//we can't create constructor of an interface
	/*
	 * public InterfaceTest() {
	 * 
	 * }
	 */
	//we can't declare variable without initialization-  int a;
	//by default variable in Interface are - public static and final
	/*
	 * Interface variables are static because Java interfaces cannot be instantiated
	 * in their own right; the value of the variable must be assigned in a static
	 * context in which no instance exists. The final modifier ensures the value
	 * assigned to the interface variable is a true constant that cannot be
	 * re-assigned by program code.
	 */
	int a=10;
	
	/*
	 * he default keyword can be used to allow an interface to provide an implementation of a method.
	 * Default methods were added to Java 8 primarily to support lambda expressions.
	 * Default methods are those methods which have some default implementation and helps
	 * in evolving the interfaces without breaking the existing code. 
	 * 
	 */
	public default void test() {
		System.out.println("test");
	}

	// main method can be available in interface
	public static void main(String[] args) {
		/*we can not create object of Interface, because methods have 
		only declaration but no body and if will create object and trying to call method than nothing will happen,so there is no use to create an object
		*/
		//InterfaceTest r=new IntefaceTest();
		System.out.println("main method test in interface");
	}

	// abstract method- no body only declaration, return type can be anything
	// overloaded method can be available in Interface
	//abstract method can't be static : public static void m1();

	public int m2();

	public String m3();

	public String m3(String name);
}