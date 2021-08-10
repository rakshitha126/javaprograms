package com.xworkz.example.clone;

	public class Oven implements Cloneable
	{
		private String name;
		private double price;
		private int temperature;
		private int duration;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getTemperature() {
			return temperature;
		}
		public void setTemperature(int temperature) {
			this.temperature = temperature;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
}