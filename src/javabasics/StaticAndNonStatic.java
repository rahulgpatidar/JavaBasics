package javabasics;

public class StaticAndNonStatic {

	/*
	 * we can interchange the position of static and public/protected/private no
	 * need to create object to call static member either it is method or variables
	 * we can call static member using ClassName.methodName/variable or directly
	 * inside main method
	 * 
	 * need to create object to call non-static member(method/variables)
	 */
	public static String name="Tom";
	static public int a=10;
	
	public boolean flag=false;
	int b=20;
	 
	public static void main(String[] args) {

		System.out.println(name);
		System.out.println(a);
		test();
		StaticAndNonStatic.test();
		
		StaticAndNonStatic s=new StaticAndNonStatic();
		s.test2();
		System.out.println(s.flag);
		System.out.println(s.b);
	}
	
	public static void test() {
		System.out.println("test method");
	}
	
	public void test2() {
		System.out.println("test2 method");
	}

}
