package javabasics;

/*In Java, a top-level class is either public or non-public. 
 *There is no "private". You can only use the public keyword or leave it off

 * A nested class, that is, a class inside of another class, can be made public,
 * package-private, protected, or private, just like any other class member. The
 * default (i.e., the one with no modifier) is package-private, visible only to
 * classes in the same package.
 * 
 * Can not create main method inside nested classes
 */
public class ClassManupulation {

	private class Test1 {

	}
	protected class Test2 {

	}
	 class Test3{

	}

	public static void main(String[] args) {
		System.out.println("test");
	}
}
