package com.dolls.dollsapp.dto;
import java.io.Serializable;

public class DollsDTO implements Comparable<DollsDTO>{
	
	private int dollsId;
	private String name;
	private int price;
	
	
	public DollsDTO(int i, String name, int price) {
		super();
		this.dollsId = i;
		this.name = name;
		this.price = price;
	}
	public int getDollsId() {
	
		return dollsId;
	}
	public void setDollsId(int dollsId) {
		this.dollsId = dollsId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString()
	{
		return "DollsDTO[dollsId="+dollsId+",name="+name+",price="+price+"]";
	}
	@Override
	public int compareTo(DollsDTO o)
	{
		return this.getDollsId()-o.getDollsId();
	}

}
