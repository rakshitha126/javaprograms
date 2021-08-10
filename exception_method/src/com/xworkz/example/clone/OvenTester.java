package com.xworkz.example.clone;

import com.xworkz.example.clone.Oven;
public class OvenTester {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Oven oven = new Oven();
		oven.setName("Samsung");
		oven.setPrice(7000.00);
		oven.setTemperature(60);
		oven.setDuration(180);
		
		System.out.println(oven.getName()+" "+oven.getPrice()+" "+oven.getTemperature()+" "+oven.getDuration());
		
		Oven ove = (Oven)oven.clone();
		ove.setPrice(8000.00);
		ove.setDuration(200);
		System.out.println(ove.getName()+" "+ove.getPrice()+" "+ove.getDuration()+" "+ove.getTemperature());
	}
	

}