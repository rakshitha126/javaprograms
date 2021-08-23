package com.electronics.electronicsapp;
import com.electronics.electronicsapp.dto.ElectronicsDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class ElectronicsUtil {

	public static void main(String[] args) {
		ElectronicsDTO dto=new ElectronicsDTO();
		dto.setId("gh78");
		dto.setName("fan");
		dto.setType("manual");
		
		ElectronicsDTO dto1=new ElectronicsDTO();
		dto1.setId("gu16");
		dto1.setName("AC");
		dto1.setType("Automatic");
		
		
		
		
		Collection<ElectronicsDTO> collection = new ArrayList<ElectronicsDTO>();
		collection.add(dto);
		collection.add(dto1);
		
		List<ElectronicsDTO> collection1 = new ArrayList<ElectronicsDTO>();
		collection1.add(dto);
		collection1.addAll(collection);
		
		Set<String> collection2=new HashSet<String>();
		collection2.add("oreo");
		collection2.add("dairymilk");
		collection2.add("kitkat");
		
		System.out.println(collection2.size());
		Iterator<String>iterator =collection2.iterator();
		while(iterator.hasNext())
		{
			String collection3=iterator.next();
			System.out.println(collection3);
		}
	

		
		Collection<ElectronicsDTO> collection4 = new ArrayList<ElectronicsDTO>();

		collection4.add(dto);
		
		
		System.out.println(collection4.containsAll(collection1));
		System.out.println(collection4.contains(dto));
		System.out.println(collection4.hashCode());
	    System.out.println(collection4.isEmpty());
	    System.out.println(collection4.removeAll(collection1));
		System.out.println(collection4.equals(collection));
		//collection4.retainAll(dto1);
		System.out.println(collection4.size());
		
		
		
		
		Iterator<ElectronicsDTO>iterator1 =collection.iterator();
		while(iterator1.hasNext())
		{
			ElectronicsDTO collection5=iterator1.next();
			System.out.println(collection5);
		}
	}
}