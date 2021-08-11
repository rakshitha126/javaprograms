package com.xworkz.atm.atmapp;

public class AtmException extends RuntimeException{
	public String getMessage() {
		return "Enter valid amount";
	}

}
