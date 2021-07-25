class AppsDTO
{
private int appsId;
private String name;
private String type;
private String sizeInMb;
private boolean internetRequired;

public AppsDTO()
{
System.out.println(this.getClass().getSimpleName()+"object is created");
}

public void setAppsId(int appsId)
{
this.appsId=appsId;
}

public int getAppsId()
{
return appsId;
}

public void setName(String name)
{
this.name=name;
}

public String getName()
{
return name;
}

public void setType(String type)
{
this.type=type;
}

public String getType()
{
return type;
}

public void setSizeInMb(String sizeInMb)
{
this.sizeInMb=sizeInMb;
}

public String getSizeInMb()
{
return sizeInMb;
}

public void isInternetRequired(boolean internetRequired)
{
this.internetRequired=internetRequired;
}

public boolean getInternetRequired()
{
return internetRequired;
}
}