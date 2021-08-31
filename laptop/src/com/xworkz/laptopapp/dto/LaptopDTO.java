package com.xworkz.laptopapp.dto;

import com.xworkz.laptopapp.dto.LaptopDTO;

public class LaptopDTO {

	private int laptopId;
	private String name;
	private int price;
	
	public LaptopDTO()
	{
		
	}

	public LaptopDTO(int laptopId, String name, int price) {
		super();
		laptopId = laptopId;
		name = name;
		this.price = price;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		laptopId = laptopId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public int compareTo(LaptopDTO o)
	{
		return this.getLaptopId()-o.getLaptopId();
	}
	
	@Override
	public String toString()
	{
		return "LaptopDTO [laptopId="+laptopId+",name="+name+",price="+price+"]";
}
}

