package com.xworkz.app.broadband;
	public class BroadBand implements Cloneable {
		
		private String name;
		private double price;
		private boolean doesSupport4g;
		
		
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
		public boolean isDoesSupport4g() {
			return doesSupport4g;
		}
		public void setDoesSupport4g(boolean doesSupport4g) {
			this.doesSupport4g = doesSupport4g;
		}
		
		public void connectingServer() {
			System.out.println("BraodBand is used widely for internet connection purpose");
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
		
		

	}
