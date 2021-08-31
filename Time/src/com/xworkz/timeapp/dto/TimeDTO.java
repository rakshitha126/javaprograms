package com.xworkz.timeapp.dto;

import com.xworkz.timeapp.dto.TimeDTO;

public class TimeDTO {

	private String name;
	private int date;
	private int price;
	
	public TimeDTO()
	{
		
	}

	public TimeDTO(String name, int date, int price) {
		super();
		this.name = name;
		this.date = date;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public int compareTo(TimeDTO o)
	{
		return this.getPrice()-o.getPrice();
	}
	
	@Override
	public String toString()
	{
		return "TimeDTO [name="+name+",date="+date+",price="+price+"]";
}
}
