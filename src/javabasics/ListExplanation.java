package javabasics;

import java.util.ArrayList;
import java.util.List;

public class ListExplanation {

	public static void main(String[] args) {
		/*
		 * List is growable in nature 
		 * It is index based 
		 * insertion order maintain, means ordered collection
		 * It can contain duplicate values
		 * we can add/remove elements
		 */
		
		List<Integer>list=new ArrayList<Integer>();
		list.add(2);
		list.add(5);
		list.add(12);
		list.add(4);
		System.out.println(list);
		
		//Indexing always starts with 0
		System.out.println(list.get(2));
		
		//position of 5	
		System.out.println(list.indexOf(5));
		
		System.out.println(list.isEmpty());
		
		list.lastIndexOf(5);
		
		list.remove(2);
		System.out.println(list);

		list.set(2, 16);
		System.out.println(list);
		
		System.out.println(list.toString());
	}
}
