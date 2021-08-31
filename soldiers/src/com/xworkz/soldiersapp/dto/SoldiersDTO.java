package com.xworkz.soldiersapp.dto;

import com.xworkz.soldiersapp.dto.SoldiersDTO;

public class SoldiersDTO {
		
		private int soldierId;
		private String name;
		private String place;
		
		public SoldiersDTO()
		{
			
		}

		public SoldiersDTO(int soldierId, String name, String place) {
			super();
			this.soldierId = soldierId;
			this.name = name;
			this.place = place;
		}

		public int getSoldierId() {
			return soldierId;
		}

		public void setSoldierId(int soldierId) {
			this.soldierId = soldierId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPlace() {
			return place;
		}

		public void setPlace(String place) {
			this.place = place;
		}
		
		
		public int compareTo(SoldiersDTO o)
		{
			return this.getSoldierId()-o.getSoldierId();
		}
		
		@Override
		public String toString()
		{
			return "SoldierDTO [soldierId="+soldierId+",name="+name+",place="+place+"]";
}
}
