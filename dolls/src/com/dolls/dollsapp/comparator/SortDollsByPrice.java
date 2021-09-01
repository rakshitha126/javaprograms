package com.dolls.dollsapp.comparator;
import java.util.Comparator;

import com.dolls.dollsapp.dto.DollsDTO;
public class SortDollsByPrice implements Comparator<DollsDTO> {

	@Override
	public int compare(DollsDTO o1, DollsDTO o2) {
		return Integer.compare(o1.getPrice(),o2.getPrice());
	}
}