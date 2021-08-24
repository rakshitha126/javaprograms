package com.mobile.mobileapp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
public class MobileUtil {
public static void main(String a[])
{
	List collection=new ArrayList();
	collection.add("recharge");
	collection.add("space");
	collection.add("samsung");
	collection.add(89);
	collection.add('G');
	collection.add(true);
	collection.add(3,"Android");
	
	System.out.println(collection.size());
	ListIterator iterator=collection.listIterator();
	while(iterator.hasNext())
	{
		Object object=iterator.next();
		System.out.println(object);
	}
	System.out.println("Backward direction");
	while(iterator.hasPrevious())
	{
		System.out.println(iterator.previous());
		
	}
	List collection1=new ArrayList();
	collection1.add(2);
	collection1.add(87);
	collection1.add(752);
	collection1.add(8);
	
	System.out.println("Before");
	System.out.println(collection1);
	Collections.sort(collection1);
	System.out.println("After");
	System.out.println(collection1);
	System.out.println("before");
	System.out.println(collection1);
	Collections.sort(collection1, Collections.reverseOrder());
	System.out.println("After");
	System.out.println(collection1);
}
}
