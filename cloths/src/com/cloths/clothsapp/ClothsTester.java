package com.cloths.clothsapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.cloths.clothsapp.comparator.SortClothsByColor;
import com.cloths.clothsapp.comparator.SortClothsByName;
import com.cloths.clothsapp.dto.ClothsDTO;

public class ClothsTester {
	public static void main(String a[]) {
		List<ClothsDTO> list = new ArrayList<ClothsDTO>();
		list.add(new ClothsDTO(111, "gown.com", "red"));
		list.add(new ClothsDTO(112, "gagra.com", "black"));
		list.add(new ClothsDTO(113, "plazo.com", "white"));
		list.add(new ClothsDTO(114, "geans.com", "blue"));
		list.add(new ClothsDTO(115, "frock.com", "pink"));

		System.out.println("Default sorting techniques");
		System.out.println("Before sorting");
		for (ClothsDTO clothsDTO : list) {
			System.out.println(clothsDTO);
		}
		System.out.println("After sorting");
		Collections.sort(list);
		for (ClothsDTO clothsDTO : list) {
			System.out.println(clothsDTO);
		}
		System.out.println("****************************************");
		System.out.println("Sorting ClothsDTO by color");
		System.out.println("Customized sorting techniques");
		System.out.println("Pre sorting");
		Iterator<ClothsDTO> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Post sorting");
		Collections.sort(list, new SortClothsByColor());
		Iterator<ClothsDTO> itr1 = list.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
