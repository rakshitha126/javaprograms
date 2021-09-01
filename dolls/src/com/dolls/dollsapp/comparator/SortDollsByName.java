package com.dolls.dollsapp.comparator;
import java.util.Comparator;

import com.dolls.dollsapp.dto.DollsDTO;
public class SortDollsByName implements Comparator<DollsDTO>{
	@Override
	public int compare(DollsDTO o1,DollsDTO o2)
	{
		return o1.getName().compareTo(o2.getName());
	}

}
