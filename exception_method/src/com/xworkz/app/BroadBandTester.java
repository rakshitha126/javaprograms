package com.xworkz.app;
import com.xworkz.app.broadband.BroadBand;
	public class BroadBandTester {
		
		public static void main(String[] args) throws CloneNotSupportedException {
			
			BroadBand broadband = new BroadBand();
			broadband.setName("Jio");
			broadband.setPrice(600.00);
			broadband.setDoesSupport4g(true);
			
			System.out.println(broadband.getName()+" "+broadband.getPrice()+" "+broadband.isDoesSupport4g());
			
			BroadBand band = (BroadBand)broadband.clone();
			band.setPrice(800.00);
			System.out.println(band.getName()+" "+band.getPrice()+" "+band.isDoesSupport4g());
			
		}

	}
