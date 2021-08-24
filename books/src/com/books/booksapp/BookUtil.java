package com.books.booksapp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class BookUtil {
	public static void main(String[] a) {

	List collection2=new ArrayList();
	collection2.add("sheets");
	collection2.add("color");
	collection2.add("number");
	collection2.add(1);
	collection2.add('D');
	collection2.add(1,"Nataraj");
	
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
	collection3.add(100);
	collection3.add(900);
	collection3.add(178);
	
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