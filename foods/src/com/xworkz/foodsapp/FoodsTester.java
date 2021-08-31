package com.xworkz.foodsapp;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

import com.xworkz.foodsapp.dao.FoodsDAO;
import com.xworkz.foodsapp.dto.FoodsDTO;
import com.xworkz.foodsapp.dao.FoodsDAOImpl;

public class FoodsTester {

	public static void main(String a[])
	{
		Set<FoodsDTO> set=new HashSet<FoodsDTO>();
		set.add(new FoodsDTO(12,"Puliyogre",250));
		set.add(new FoodsDTO(26,"Briyani",600));
		set.add(new FoodsDTO(98,"Dosa",45));
		
		System.out.println("Fetching set through method reference");
		set.forEach(System.out::println);
		
		System.out.println("Fetching set through lambda expression");
		Consumer<Set<FoodsDTO>> consumer=(f)->System.out.println(set);
		consumer.accept(set);
		
		System.out.println("Using method reference");
		FoodsDAO food=FoodsDAOImpl::delicious;
		food.delicious();
		
		System.out.println("Using Lmbda expression");
		FoodsDAO food1=()->System.out.println("Foods are very delicious");
		food1.delicious();
	}
}
