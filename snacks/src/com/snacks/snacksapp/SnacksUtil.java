package com.snacks.snacksapp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class SnacksUtil {
	public static void main(String[] a) {

		List collection2=new ArrayList();
		collection2.add("Lays");
		collection2.add("Icecream");
		collection2.add("Chocolate");
		collection2.add(11);
		collection2.add('D');
		collection2.add(1,"Parle");
		
		System.out.println(collection2.size());
		ListIterator iterator =collection2.listIterator();
		while(iterator.hasNext())
		{
			Object object=iterator.next();
			System.out.println(object);
		}
	    System.out.println("Backward Direction");
	    while(iterator.hasPrevious())
		{
			
			System.out.println(iterator.previous());
		}
	    List collection3=new ArrayList();
		collection3.add(22);
		collection3.add(10);
		collection3.add(90);
		collection3.add(17);
		
		System.out.println("Before");
		System.out.println(collection3);
		Collections.sort(collection3);
		System.out.println("After");
		System.out.println(collection3);
		System.out.println("Before");
		System.out.println(collection3);
	    Collections.sort(collection3,Collections.reverseOrder());
	    System.out.println("After");
		System.out.println(collection3);
	    
	    
	}
}
