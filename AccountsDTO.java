class AccountsDTO
{
private int accountsId;
private String name;
private String type;
private String sizeInMb;
private boolean internetRequired;

public AccountsDTO()
{
System.out.println(this.getClass().getSimpleName()+"object is created");
}

public void setAccountsId(int appsId)
{
this.accountsId=accountsId;
}

public int getAccountsId()
{
return accountsId;
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