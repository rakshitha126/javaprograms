class Country
{
String name;
int noOfStates;
long population;
int noOfUnionTerritories;
public Country(String nm,int noOfSts,long pop,int noOfUnionTerr)
{
System.out.println("Country object is created");
name=nm;
noOfStates=noOfSts;
population=pop;
noOfUnionTerritories=noOfUnionTerr;
}
public void giveCitizenShip()
{
System.out.println(" ");
}
public void printCountryDetails()
{
System.out.println(name+" "+noOfStates+" "+population+" "+noOfUnionTerritories);
}
public void develop()
{
System.out.println("developing something");
}
}