package javabasics;

public class DataTypes {

	/* These all are premitive datatype and because of these Java is not pure object oriented programming
	 * All the premitive datatypes have wrapper classes around it
	 *  
	 */
	
	int a=10;
	static int b;
	String name="Tom";
	boolean flag;
	String id;
	float f=10.4f;
	float z;
	double x=12.2;
	double y;
	public static void main(String[] args) {

		DataTypes d=new DataTypes();
		System.out.println(d.a);
		
		System.out.println(d.b);
		b=20;
		System.out.println(b);
		
		System.out.println(d.flag);
		
		System.out.println(d.id);
		System.out.println(d.f);
		System.out.println(d.x);
		System.out.println(d.y);
		System.out.println(d.z);
	}

}
