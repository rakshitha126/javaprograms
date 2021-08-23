package com.collection.collectionprogram;

	import java.util.ArrayList;

	import java.util.Collection;
	import java.util.Iterator;

	public class CollectionProgram {
		    public static void main(String[] args){
		
		    
		CollectionProgram<Object> collection=new ArrayList<Object>();
		collection.add(120);
		collection.add("FBB");
		collection.add("Trends");
		collection.add("LifeStyle");
		collection.add("PVR's");
		collection.add("340.00");
		collection.add("789321L");
		System.out.println(collection.size());
		/*collection.removeAll(collection);*/
		for (Object object : collection) {
			System.out.println(object);
		}
		Iterator<Object> iterator=collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		CollectionProgram<String> collection1 = new ArrayList<String>();

		collection1.add("189");
		collection1.add("2369");
		collection1.add("06");
		collection1.add("88");
		for (String string : collection1) {
			System.out.println(string);
			
		}
		CollectionProgram<String> sum = new ArrayList<String>();
		sum.addAll(collection1);
		System.out.println("Contains All Method");
		System.out.println(sum.containsAll(collection1));
		System.out.println("Equals method");
		System.out.println(sum.equals(collection));
		sum.retainAll(sum);
		/*collection.retainAll(collection1);*/
		System.out.println(sum.size());
			
		}
	
}
