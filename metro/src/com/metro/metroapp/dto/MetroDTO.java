package com.metro.metroapp.dto;
public class MetroDTO {
	private String stationName;
	private int noOfTrains;
	private boolean isBookingAvailable;
	
	
public void MetroDTO() {
	
}


public String getStationName() {
	return stationName;
}


public void setStationName(String stationName) {
	this.stationName = stationName;
}


public int getNoOfTrains() {
	return noOfTrains;
}


public void setNoOfTrains(int noOfTrains) {
	this.noOfTrains = noOfTrains;
}


public boolean isBookingAvailable() {
	return isBookingAvailable;
}


public void setBookingAvailable(boolean isBookingAvailable) {
	this.isBookingAvailable = isBookingAvailable;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (isBookingAvailable ? 1231 : 1237);
	result = prime * result + noOfTrains;
	result = prime * result + ((stationName == null) ? 0 : stationName.hashCode());
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
	MetroDTO other = (MetroDTO) obj;
	if (isBookingAvailable != other.isBookingAvailable)
		return false;
	if (noOfTrains != other.noOfTrains)
		return false;
	if (stationName == null) {
		if (other.stationName != null)
			return false;
	} else if (!stationName.equals(other.stationName))
		return false;
	return true;
}


@Override
public String toString() {
	return "MetroDTO [stationName=" + stationName + ", noOfTrains=" + noOfTrains + ", isBookingAvailable="
			+ isBookingAvailable + "]";
}


}
