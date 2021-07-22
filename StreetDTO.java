class StreetDTO
{
	private String[] streetNo;
	public StreetDTO()
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	public void setStreetNo(String[] streetNo)
	{
		this.streetNo=streetNo;
	}	
	public String[] getStreetNo()
	{
		return streetNo;
	}
}