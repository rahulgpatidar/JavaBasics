package javabasics;

public class FinalKeyword {

	public static void main(String[] args) {
		final int x = 23;

		
		//we can declare in one line and assign value in other line but once value is assigned, we can not modify.
		final int a;
		a = 10;
		int b=30;
		b=b;	
		// a=20; -not allowed to reassign

		final String name;
		name = "rahul";
        
	}

	//final method can be overloaded
	//static method can be overloaded
	//below 4 method are overloaded
	
	public final void m1() {

	}

	public final void m1(int a) {

	}

	public static final void m1(int a, String s) {

	}

	public static final void m1(int a, String s, double d) {

	}
}
