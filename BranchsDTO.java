class BranchsDTO
{
private int branchsId;
private String name;
private String type;
private String sizeInMb;
private boolean internetRequired;

public BranchsDTO()
{
System.out.println(this.getClass().getSimpleName()+"object is created");
}

public void setBranchsId(int appsId)
{
this.branchsId=branchsId;
}

public int getBranchsId()
{
return branchsId;
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