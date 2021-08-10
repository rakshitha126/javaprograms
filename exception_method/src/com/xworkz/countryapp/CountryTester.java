package com.xworkz.countryapp;

	import com.xworkz.countryapp.country.Country;
	public class CountryTester
	{
		public static void main(String a[])
		{
			Country country=new Country();
			country.setName("India");
			country.setCapitalCity("Delhi");
			country.setPopulation(1000000000);
			System.out.println(country.getName()+" "+country.getCapitalCity()+" "+country.getPopulation());
			try
			{
				Country country2=(Country)country.clone();
				country2.setPopulation(1100000000);
				System.out.println(country2.getName()+" "+country2.getCapitalCity()+" "+country2.getPopulation());
			}catch(CloneNotSupportedException e)
			{
				e.printStackTrace();
			}
		}
	}