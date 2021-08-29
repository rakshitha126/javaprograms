package com.websites.websitesapp.dto;
import java.io.Serializable;
public class WebsitesDTO implements Comparable<WebsitesDTO>{
	private int websiteId;
	private String name;
	private String duration;
	
	public WebsitesDTO(int websiteId,String name,String duration)
	{
		this.websiteId=websiteId;
		this.name=name;
		this.duration=duration;
	}

	public int getWebsiteId() {
		return websiteId;
	}

	public void setWebsiteId(int websiteId) {
		this.websiteId = websiteId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString()
	{
		return "WebsitesDTO[websiteId="+websiteId+",name="+name+",duration="+duration+"]";
	
	}
	@Override
	public int compareTo(WebsitesDTO o)
	{
		return this.getWebsiteId()-o.getWebsiteId();
	}
	

}
