class CountryDTO
{
private StateDTO[] states;
private String countryName;
public CountryDTO()
{
System.out.println(this.getClass().getSimpleName()+"created");
}
public void setStates(StateDTO[] states)
{
this.states=states;
}
public StateDTO[] getStates() 
{
return states;
}
public void setCountryName(String countryName)
{
this.countryName=countryName;
}
public String getCountryName()
{
return countryName;
}
}