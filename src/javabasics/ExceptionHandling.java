package javabasics;

public class ExceptionHandling {

	/*
	 * Code which can produce exception will be written in try block 
	 *exception will be handled by catch block
	 */
	public void test() {
		int a = 10;
		try {
			int b = a / 0;
			System.out.println(b);
		} catch (Exception  e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		} finally {
			/* This block is used to right cleanup activity (ex. Connection close statement)
			 * Finally block will Always execute untill and unless will get exception in this block
			 *  or will call Sytem.exit() 
			 *  or memory/system crash
			 */
			System.out.println("Always execute untill and unless will get exception in this block");
		}
	}

	public static void main(String[] args) {

		ExceptionHandling e = new ExceptionHandling();
		e.test();
		e.m1();
		fun();
	}
	
	/*
	 * throws is a keyword in Java which is used in the signature of method to
	 * indicate that this method might throw one of the listed type exceptions. The
	 * caller to these methods has to handle the exception using a try-catch block.
	 */
	public void m1() throws NumberFormatException{
		String s="100A";
		int x=Integer.parseInt(s);
		System.out.println(x);
	}

	/*
	 * The throw keyword in Java is used to explicitly throw an exception from a
	 * method or any block of code. We can throw either checked or unchecked
	 * exception. The throw keyword is mainly used to throw custom exceptions.
	 */
	public static void fun() 
	    { 
	        try
	        { 
	            throw new NullPointerException("demo"); 
	        } 
	        catch(NullPointerException e) 
	        { 
	            System.out.println("Caught inside fun()."); 
	            throw e; // rethrowing the exception 
	        } 
	    } 
}
