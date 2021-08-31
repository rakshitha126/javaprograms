package com.xworkz.laptopapp;

	import java.util.Collections;
	import java.util.HashSet;
	import java.util.Set;
	import java.util.function.Consumer;

	import com.xworkz.laptopapp.dao.LaptopDAO;
	import com.xworkz.laptopapp.dto.LaptopDTO;
	import com.xworkz.laptopapp.dao.LaptopDAOImpl;

public class LaptopTester{
		public static void main(String a[])
		{
			Set<LaptopDTO> set=new HashSet<LaptopDTO>();
			set.add(new LaptopDTO(123,"Dell",250000));
			set.add(new LaptopDTO(26,"Hp",650000));
			set.add(new LaptopDTO(986,"Apple",1450000));
			
			System.out.println("Fetching set through method reference");
			set.forEach(System.out::println);
			
			System.out.println("Fetching set through lambda expression");
			Consumer<Set<LaptopDTO>> consumer=(f)->System.out.println(set);
			consumer.accept(set);
			
			System.out.println("Using method reference");
			LaptopDAO laptop=LaptopDAOImpl::MoreSpace;
			laptop.MoreSpace();
			
			System.out.println("Using Lmbda expression");
			LaptopDAO laptop1=()->System.out.println("Laptop has more space");
			laptop1.MoreSpace();
		}
	}
