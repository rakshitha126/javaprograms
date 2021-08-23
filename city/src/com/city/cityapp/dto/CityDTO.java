package com.city.cityapp.dto;
public class CityDTO {
		private String name;
		private int population;
		private int noOfTaluks;
		private String dcName;
	public void CityDTO() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getNoOfTaluks() {
		return noOfTaluks;
	}
	public void setNoOfTaluks(int noOfTaluks) {
		this.noOfTaluks = noOfTaluks;
	}
	public String getDcName() {
		return dcName;
	}
	public void setDcName(String dcName) {
		this.dcName = dcName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dcName == null) ? 0 : dcName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfTaluks;
		result = prime * result + population;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CityDTO other = (CityDTO) obj;
		if (dcName == null) {
			if (other.dcName != null)
				return false;
		} else if (!dcName.equals(other.dcName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfTaluks != other.noOfTaluks)
			return false;
		if (population != other.population)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CityDTO [name=" + name + ", population=" + population + ", noOfTaluks=" + noOfTaluks + ", dcName=" + dcName
				+ "]";
	}
	}

