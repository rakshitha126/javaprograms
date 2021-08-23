package com.metro.metroapp;
import com.metro.metroapp.dto.MetroDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class MetroUtil {

	public static void main(String[] args) {
		MetroDTO dto=new MetroDTO();
		dto.setStationName("Srirampura");
		dto.setNoOfTrains(4);
		dto.setBookingAvailable(true);
		
		MetroDTO metro=new MetroDTO();
	    metro.setStationName("Chickpete");
		metro.setNoOfTrains(6);
		metro.setBookingAvailable(false);
		
		
		Collection<MetroDTO> collection = new ArrayList<MetroDTO>();
		collection.add(dto);
		collection.add(metro);
		
		List<MetroDTO> collection1 = new ArrayList<MetroDTO>();
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
	

		
		Collection<MetroDTO> collection4 = new ArrayList<MetroDTO>();

		collection4.add(metro);
		
		
		System.out.println(collection4.containsAll(collection1));
		System.out.println(collection4.contains(dto));
		System.out.println(collection4.hashCode());
	    System.out.println(collection4.isEmpty());
	    System.out.println(collection4.removeAll(collection1));
		System.out.println(collection4.equals(collection));
		//collection4.retainAll(dto1);
		System.out.println(collection4.size());
		
		
		
		
		Iterator<MetroDTO>iterator1 =collection.iterator();
		while(iterator1.hasNext())
		{
			MetroDTO collection5=iterator1.next();
			System.out.println(collection5);
		}
	}
}

