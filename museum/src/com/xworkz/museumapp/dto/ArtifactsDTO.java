package com.xworkz.museumapp.dto;

public class ArtifactsDTO implements Comparable<ArtifactsDTO> {
	
	private int artifactsId;
	private String name;
	private int inventedIn;
	
	public ArtifactsDTO()
	{
		
	}

	public ArtifactsDTO(int artifactsId, String name, int inventedIn) {
		super();
		this.artifactsId = artifactsId;
		this.name = name;
		this.inventedIn = inventedIn;
	}

	public int getArtifactsId() {
		return artifactsId;
	}

	public void setArtifactsId(int artifactsId) {
		this.artifactsId = artifactsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInventedIn() {
		return inventedIn;
	}

	public void setInventedIn(int inventedIn) {
		this.inventedIn = inventedIn;
	}
	
	@Override
	public String toString()
	{
		return "ArtifactsDTO [artifactsId=" + artifactsId +",name="+name+",inventedIn="+inventedIn+"]";
	}
	
	@Override
	public int compareTo(ArtifactsDTO o)
	{
		return this.getArtifactsId()-o.getArtifactsId();
	}

}
