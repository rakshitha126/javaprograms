package com.city.cityapp;

	import com.city.cityapp.dto.CityDTO;
	import  java.util.ArrayList;
	import java.util.Collection;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Set;
	public class CityUtil{
		public static void main(String[] args) {
			CityDTO dto=new CityDTO();
			dto.setName("Mysore");
			dto.setPopulation(1234992);
			dto.setNoOfTaluks(11);
			dto.setDcName("Dr.Bagadi Gautham");
			
			CityDTO dto1=new CityDTO();
			dto.setName("Mandya");
			dto.setPopulation(514790);
			dto.setNoOfTaluks(7);
			dto.setDcName("Aswathi");
			
			
			
			
			Collection<CityDTO> collection = new ArrayList<CityDTO>();
			collection.add(dto);
			collection.add(dto1);
			
			List<CityDTO> collection1 = new ArrayList<CityDTO>();
			collection1.add(dto);
			collection1.addAll(collection);
			
			Set<String> collection2=new HashSet<String>();
			collection2.add("Chocolate");
			collection2.add("Icecream");
			collection2.add("Perfumes");
			
			System.out.println(collection2.size());
			Iterator<String>iterator =collection2.iterator();
			while(iterator.hasNext())
			{
				String collection3=iterator.next();
				System.out.println(collection3);
			}
		

			
			Collection<CityDTO> collection4 = new ArrayList<CityDTO>();

			collection4.add(dto);
			
			
			System.out.println(collection4.containsAll(collection1));
			System.out.println(collection4.contains(dto));
			System.out.println(collection4.hashCode());
		    System.out.println(collection4.isEmpty());
		    System.out.println(collection4.removeAll(collection1));
			System.out.println(collection4.equals(collection));
			//collection4.retainAll(dto1);
			System.out.println(collection4.size());
			
			
			
			
			Iterator<CityDTO>iterator1 =collection.iterator();
			while(iterator1.hasNext())
			{
				CityDTO collection5=iterator1.next();
				System.out.println(collection5);
			}
	}

}
