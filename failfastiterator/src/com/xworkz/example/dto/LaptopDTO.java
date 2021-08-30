package com.xworkz.example.dto;

public class LaptopDTO {

	private int laptopId;
	private String laptopName;
	private double price;
	
	public LaptopDTO()
	{
		
	}
	
	public LaptopDTO(int laptopId, String laptopName, double price) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.price = price;
	}
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", price=" + price + "]";
	}
}
