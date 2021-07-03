class City
{
String name;
String color;
int distance;
int km;
public City(String nm,String cl,int ds,int km)
{
System.out.println("City objective is created");
name=nm;
color=cl;
distance=ds;
km=km;
}
public void place()
{
System.out.println(" ");
}
public void printCityDetails()
{
System.out.println(name+" "+color+" "+distance+" "+km);
}
public void toSee()
{
System.out.println("To view");
}
}