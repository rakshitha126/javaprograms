package com.xworkz.soldiersapp;


	import java.util.Collections;
	import java.util.HashSet;
	import java.util.Set;
	import java.util.function.Consumer;

	import com.xworkz.soldiersapp.dao.SoldiersDAO;
	import com.xworkz.soldiersapp.dto.SoldiersDTO;
	import com.xworkz.soldiersapp.dao.SoldiersDAOImpl;

public class SoldiersTester{
		public static void main(String a[])
		{
			Set<SoldiersDTO> set=new HashSet<SoldiersDTO>();
			set.add(new SoldiersDTO(123,"Dilip","Mysore"));
			set.add(new SoldiersDTO(26,"Harsha","Bangalore"));
			set.add(new SoldiersDTO(986,"Arpitha","Shivmoga"));
			
			System.out.println("Fetching set through method reference");
			set.forEach(System.out::println);
			
			System.out.println("Fetching set through lambda expression");
			Consumer<Set<SoldiersDTO>> consumer=(f)->System.out.println(set);
			consumer.accept(set);
			
			System.out.println("Using method reference");
			SoldiersDAO soldier=SoldiersDAOImpl::Respect;
			soldier.Respect();
			
			System.out.println("Using Lmbda expression");
			SoldiersDAO laptop1=()->System.out.println("Always Respect Soldiers");
			laptop1.Respect();
		}

}
