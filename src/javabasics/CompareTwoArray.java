package javabasics;

public class CompareTwoArray {

	public static void main(String args[]) {
		int array1[]= {1,2,3,4};
		int array2[]= {1,2,3};
	  
		boolean b = true;
		
        if (array1 != null && array2 != null){
          if (array1.length != array2.length)
              b = false;
          else
              for (int i = 0; i < array2.length; i++) {
                  if (array2[i] != array1[i]) {
                      b = false;    
                  }                 
            }
        }else{
          b = false;
        }
        System.out.println(b);
	}
}
