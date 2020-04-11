package javabasics;

public class ExceptionHandling2 {

	public int test() {
		int a = 0;
		try {
			a = 10 / 0;
			//return 10; we can write here as well but still we need to return at the end

		} catch (Exception e) {
			//return 10; we can write here as well but still we need to return at the end 
		} finally {
			// return 0;
		}

		return a;// return statement will always be outside of all the blocks or it will be in
					// finally block

	}
}
