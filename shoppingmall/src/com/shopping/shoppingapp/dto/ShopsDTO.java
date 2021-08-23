package com.shopping.shoppingapp.dto;
import java.io.Serializable;

public class ShopsDTO implements Serializable{
	private int shopId;
	private String floor;
	private String shopName;
	private String type;
	public ShopsDTO() {
		System.out.println(this.getClass().getSimpleName()+"object is created");
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString()
	{
		return"ShopsDTO[shopId= "+shopId+",floor= "+floor+",shopName="+shopName+",type="+type+"]";
	}

}
