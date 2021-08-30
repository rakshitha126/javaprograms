package com.xworkz.example;
import java.util.ArrayList;
import java.util.Iterator;
import com.xworkz.example.dto.LaptopDTO;
public class LaptopTester {

	public static void main(String a[])
	{
		ArrayList<LaptopDTO> arrayList=new ArrayList<LaptopDTO>();
		arrayList.add(new LaptopDTO(12,"Dell",450000.00));
		arrayList.add(new LaptopDTO(11,"HP",559900.00));
		arrayList.add(new LaptopDTO(14,"Asus",69000.00));
		
		Iterator<LaptopDTO> itr=arrayList.iterator();
		while(itr.hasNext())
		{
			LaptopDTO lap=itr.next();
			System.out.println(lap);
			if(lap.getLaptopId()==14)
			{
				arrayList.remove(lap);
			}
		}
		System.out.println(arrayList);
	}
}
