package com.xworkz.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.example.dto.RestaurantDTO;

//Example for fail-safe iterator
public class RestaurantTester {
	
	public static void main(String[] args) {
		
		List<RestaurantDTO> list = new ArrayList<RestaurantDTO>();
		list.add(new RestaurantDTO(11, "Ayodhya Grand", "BDA Complex"));
		list.add(new RestaurantDTO(55, "Palate", "Nagarbhavi"));
		list.add(new RestaurantDTO(85, "Watering hole", "RR Nagar"));
		
		Iterator<RestaurantDTO> iter = list.iterator();
		while(iter.hasNext()) {
			RestaurantDTO dto = iter.next();
			System.out.println(dto);
			if(dto == new RestaurantDTO(55, "Palate", "Nagarbhavi")) {
				list.add(new RestaurantDTO(65, "Hakuna matata", "Race course road"));
			}
		}
		System.out.println(list);
		
		
	}

}