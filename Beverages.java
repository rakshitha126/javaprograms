class Beverages
{
String name;
String type;
int cost;
String color;
public Beverages(String nm,String ty,int cst,String clr)
{
System.out.println("Beverages object is created");
name=nm;
type=ty;
cost=cst;
color=clr;
}
public void drink()
{
System.out.println(" ");
}
public void printBeveragesDetails()
{
System.out.println(name+" "+type+" "+cost+" "+color);
}
public void thirst()
{
System.out.println("To quench thirst");
}
}