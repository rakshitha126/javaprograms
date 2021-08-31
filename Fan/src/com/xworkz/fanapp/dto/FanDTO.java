package com.xworkz.fanapp.dto;

public class FanDTO {

	private String name;
	private String brand;
	private int price;
	
	public FanDTO()
	{
		
	}

	public FanDTO(String name, String brand, int price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int compareTo(FanDTO o)
	{
		return this.getPrice()-o.getPrice();
	}
	
	@Override
	public String toString()
	{
		return "FanDTO=[name="+name+",brand="+brand+",price="+price+"]";
	}
}
