package com.cloths.clothsapp.dto;

import java.io.Serializable;

public class ClothsDTO implements Comparable<ClothsDTO> {
	private int clothsId;
	private String name;
	private String color;

	public ClothsDTO(int clothsId, String name, String color) {
		super();
		this.clothsId = clothsId;
		this.name = name;
		this.color = color;
	}

	public int getClothsId() {
		return clothsId;
	}

	public void setClothsId(int clothsId) {
		this.clothsId = clothsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "ClothsDTO[clothsId=" + clothsId + ",name=" + name + ",color=" + color + "]";
	}

	@Override
	public int compareTo(ClothsDTO o) {
		return this.getClothsId() - o.getClothsId();
	}
}
