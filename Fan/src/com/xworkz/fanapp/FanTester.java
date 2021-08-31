package com.xworkz.fanapp;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

import com.xworkz.fanapp.dao.FanDAO;
import com.xworkz.fanapp.dto.FanDTO;
import com.xworkz.fanapp.dao.FanDAOImpl;

public class FanTester {

	
	public static void main(String a[])
	{
		Set<FanDTO> set=new HashSet<FanDTO>();
		set.add(new FanDTO("Usha","Usha",25000));
		set.add(new FanDTO("Bajaj","Bajaj",40000));
		set.add(new FanDTO("Nanja","Subha",12000));
		
		System.out.println("Featching set through method reference");
		set.forEach(System.out::println);
		
		System.out.println("Featching set through Lambda Expression");
		Consumer<Set<FanDTO>> consumer=(g)->System.out.println(set);
		consumer.accept(set);
		
		System.out.println("Using method reference");
		FanDAO fan=FanDAOImpl::Brand;
		fan.Brand();
		
		System.out.println("Using Lambda Expression");
		FanDAO fan1=()->System.out.println("Checking Brand");
		fan1.Brand();
	}
}
