package com.xworkz.museumapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.xworkz.museumapp.dao.MuseumDAO;
import com.xworkz.museumapp.dao.MuseumDAOImpl;
import com.xworkz.museumapp.dto.ArtifactsDTO;


public class MuseumTester {

	public static void main(String args[])
	{
		List<ArtifactsDTO> list=new ArrayList<ArtifactsDTO>();
		list.add(new ArtifactsDTO(145,"Gramaphone",1877));
		list.add(new ArtifactsDTO(146,"Steam Wagon",1906));
		list.add(new ArtifactsDTO(174,"Vintage Microphone",1877));
		
		System.out.println("Fetching list through method reference");
		list.forEach(System.out::println);
		
		System.out.println("Fetching list through lambda expression");
		Consumer<List<ArtifactsDTO>> consumer=(s) ->System.out.println(list);
		consumer.accept(list);
		
		System.out.println("Default sorting techiques");
		Collections.sort(list);
		list.forEach(System.out::println);
		
		System.out.println("Sort by Artifacts Invented in");
		Collections.sort(list,new SortArtifactsByName());
		list.forEach(System.out::println);
		
		System.out.println("using method reference");
		MuseumDAO dao=MuseumDAOImpl::gainKnowledge;
		dao.gainKnowledge();
		
		System.out.println("using lambda expression");
		MuseumDAO dao1=()->System.out.println("By visiting museum we will gain knowledge about the unique artifacts");
		dao1.gainKnowledge();
		
		BiConsumer<Integer, Integer>biConsumer=(a,b)->System.out.println(a+b);
		biConsumer.accept(10,5);
	}
}
