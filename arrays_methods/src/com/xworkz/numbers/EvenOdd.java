package com.xworkz.numbers;

public class EvenOdd {
	public static void main(String a[])
	{
		String[] perfume={"fogg","Secret","wild stone","engage","yardley"};
		System.out.println(perfume[0]+" "+perfume[2]+" "+perfume[3]+" "+perfume[4]);
		System.out.println(perfume.length);
		String vegetablesAndFruits[]={"tomato","apple","potato","strawberry","pumpkin","mango","dragonfruit","litchie","carrot","kiwi","bitterguard"};
		int amountPerkg[]={12,100,20,120,40,100,60,80,30,120,89};
		System.out.println(vegetablesAndFruits.length);
		String value[]=fetchVegetablesAndPrice(vegetablesAndFruits,amountPerkg);
		for(String s:value)
		{
		System.out.println(s);
		}
		}
		public static String[] fetchVegetablesAndPrice(String veggie[],int amountPerkg[])
		{
		String valueveggie[]=new String[veggie.length];
		for(int i=0;i<veggie.length;i++)
		{
		veggie[i]=veggie[i] +" "+ amountPerkg[i];
		valueveggie[i]=veggie[i];
		}
		return valueveggie;
		}
		}
