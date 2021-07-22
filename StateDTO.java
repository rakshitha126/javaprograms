class StateDTO
{
private CityDTO[] cities;
private String stateName;
public StateDTO()
{
System.out.println(this.getClass().getSimpleName()+"created");
}
public void setCity(CityDTO[] cities)
{
this.cities=cities;
}
public CityDTO[] getcities() 
{
return cities;
}
public void setStateName(String stateName)
{
this.stateName=stateName;
}
public String getStateName()
{
return stateName;
}
}