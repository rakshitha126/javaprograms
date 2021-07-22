class AreaDTO
{
private StreetDTO[] street;
private String areaName;
public AreaDTO()
{
System.out.println(this.getClass().getSimpleName()+"created");
}
public void setStreet(StreetDTO[] street)
{
this.street=street;
}
public StreetDTO[] getstreet() 
{
return street;
}
public void setAreaName(String areaName)
{
this.areaName=areaName;
}
public String getAreaName()
{
return areaName;
}
}