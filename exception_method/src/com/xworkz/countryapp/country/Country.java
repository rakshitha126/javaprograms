package com.xworkz.countryapp.country;

	public class Country implements Cloneable
	{
		private int population;
		private String name;
		private String capitalCity;
		public String getName()
		{
			return name;
		}
		public void setName(String name) 
		{
			this.name=name;
		}
		public int getPopulation()
		{
			return population;
		}
		public void setPopulation(int population)
		{
			this.population=population;
		}
		public String getCapitalCity() {
			return capitalCity;
		}
		public void setCapitalCity(String capitalCity)
		{
			this.capitalCity=capitalCity;
		}
		public void provideCitizenship()
		{
			System.out.println("providing citizenship thru id");
		}
		@Override
		public Object clone() throws CloneNotSupportedException 
		{
			return super.clone();
		}
	}

