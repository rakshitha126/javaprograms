package com.cloths.clothsapp.comparator;
import java.util.Comparator;
import com.cloths.clothsapp.dto.ClothsDTO;
public class SortClothsByColor implements Comparator<ClothsDTO>{
	@Override
	public int compare(ClothsDTO o1,ClothsDTO o2)
	{
		return o1.getName().compareTo(o2.getName());
	}

}