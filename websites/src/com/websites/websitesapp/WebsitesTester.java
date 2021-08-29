package com.websites.websitesapp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.websites.websitesapp.comparator.SortWebsiteByDuration;
import com.websites.websitesapp.comparator.SortWebsiteByName;
import com.websites.websitesapp.dto.WebsitesDTO;
public class WebsitesTester {
	public static void main(String a[])
	{
		List<WebsitesDTO> list=new ArrayList<WebsitesDTO>();
		list.add(new WebsitesDTO(147,"learningsomethingneweveryday","8 years"));
		list.add(new WebsitesDTO(148,"google.com","6 years"));
		list.add(new WebsitesDTO(149,"operamax.com","1 year"));
		list.add(new WebsitesDTO(150,"microsoftedge.com","2 years"));
		list.add(new WebsitesDTO(151,"gmail.com","9 years"));
		
		System.out.println("Default sorting technique");
		System.out.println("Before sorting");
		for(WebsitesDTO websitesDTO:list)
		{
			System.out.println(websitesDTO);
		}
		System.out.println("Default sorting technique");
		System.out.println("Before sorting");
		for(WebsitesDTO websitesDTO:list)
		{
			System.out.println(websitesDTO);
		}
		System.out.println("After sorting");
		Collections.sort(list);
		for(WebsitesDTO websitesDTO:list)
		{
			System.out.println(websitesDTO);
		}
		System.out.println("******************************************************");
		System.out.println("Sorting WebsitesDTO by Name");
		System.out.println("Customized sorting technique");
		System.out.println("Pre sorting");
		for(WebsitesDTO websitesDTO:list)
		{
			System.out.println(websitesDTO);
		}
		System.out.println("Post sorting");
		Collections.sort(list, new SortWebsiteByName());
		for(WebsitesDTO websitesDTO:list)
		{
			System.out.println(websitesDTO);
		}
		System.out.println("*********************************************************");
		System.out.println("Sorting WebsitesDTO by Duration");
		System.out.println("Customized Sorting Technique");
		System.out.println("Pre Sorting");
		Iterator<WebsitesDTO> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Post Sorting");
		Collections.sort(list, new SortWebsiteByDuration());
		Iterator<WebsitesDTO> itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}

}
