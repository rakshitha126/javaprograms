class Plant
{
String name;
String color;
int years;
String roots;
public Plant(String nm,String cl,int yrs,String rts)
{
System.out.println("plant received");
name=nm;
color=cl;
years=yrs;
roots=rts;
}
public void fetchPlant()
{
System.out.println(" ");
}
public void printPlantDetails()
{
System.out.println(name+" "+color+" "+years+" "+roots);
}
public void savePlant()
{
System.out.println("Plantation");
}
}