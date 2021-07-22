class CityDTO
{
private AreaDTO[] area;
private String cityName;
public CityDTO()
{
System.out.println(this.getClass().getSimpleName()+"created");
}
public void setArea(AreaDTO[] area)
{
this.area=area;
}
public AreaDTO[] getarea() 
{
return area;
}
public void setCityName(String cityName)
{
this.cityName=cityName;
}
public String getCityName()
{
return cityName;
}
}