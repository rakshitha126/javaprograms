package com.books.booksapp.dto;
import java.io.Serializable;

import com.cloths.clothsapp.dto.ClothsDTO;
public class BooksDTO {

	private int sheets;
	private String color;
	private int Number;
	
	
	public BooksDTO(int sheets, String color, int number) {
		super();
		this.sheets = sheets;
		this.color = color;
		this.number = number;
	}
	private int number;
	public int getSheets() {
		return sheets;
	}
	public void setSheets(int sheets) {
		this.sheets = sheets;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "BooksDTO[booksId=" + clothsId + ",name=" + name + ",color=" + color + "]";
	}

	@Override
	public int compareTo(ClothsDTO o) {
		return this.getClothsId() - o.getClothsId();
	}
	
}
