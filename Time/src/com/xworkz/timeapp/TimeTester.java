package com.xworkz.timeapp;


	import java.util.Collections;
	import java.util.HashSet;
	import java.util.Set;
	import java.util.function.Consumer;

	import com.xworkz.timeapp.dao.TimeDAO;
	import com.xworkz.timeapp.dao.TimeDAOImpl;
	import com.xworkz.timeapp.dto.TimeDTO;

public class TimeTester{
		public static void main(String a[])
		{
			Set<TimeDTO> set=new HashSet<TimeDTO>();
			set.add(new TimeDTO("Titan",12,25000));
			set.add(new TimeDTO("FastTrack",5,6000));
			set.add(new TimeDTO("Asur",18,1450000));
			
			System.out.println("Fetching set through method reference");
			set.forEach(System.out::println);
			
			System.out.println("Fetching set through lambda expression");
			Consumer<Set<TimeDTO>> consumer=(f)->System.out.println(set);
			consumer.accept(set);
			
			System.out.println("Using method reference");
			TimeDAO time=TimeDAOImpl::Brand;
			time.Brand();
			
			System.out.println("Using Lmbda expression");
			TimeDAO time1=()->System.out.println("Checking Brand");
			time1.Brand();
		}


}
