package com.dolls.dollsapp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.dolls.dollsapp.dto.DollsDTO;
public class DollsTester {
	public static void main(String a[])
	{
		List<DollsDTO> list=new ArrayList<DollsDTO>();
		list.add(new DollsDTO(25,"Teddy",1500));
		list.add(new DollsDTO(26,"Micky-mouse",2500));
		list.add(new DollsDTO(27,"Tom & Jerry",2300));
		list.add(new DollsDTO(28,"Tourtise",1200));
		list.add(new DollsDTO(29,"Barbie",2900));
		list.add(new DollsDTO(30,"Baby-Doll",1100));
		
		System.out.println("Default sorting techniques");
		System.out.println("Before sorting");
		for(DollsDTO dollsDTO:list)
		{
			System.out.println(dollsDTO);
		}
		System.out.println("After sorting");
		Collections.sort(list);
		for(DollsDTO dollsDTO:list)
		{
			System.out.println(dollsDTO);
		}
		System.out.println("*************************************************************");
		System.out.println("Sorting DollsDTO by price");
		System.out.println("Customized sorting techniques");
		System.out.println("Pre sorting");
		Iterator<DollsDTO> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
