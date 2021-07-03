class Dessert
{
String name;
String type;
int cost;
String color;
public Dessert(String nm,String ty,int cst,String clr)
{
System.out.println("Dessert object is created");
name=nm;
type=ty;
cost=cst;
color=clr;
}
public void sweet()
{
System.out.println(" ");
}
public void printDessertDetails()
{
System.out.println(name+" "+type+" "+cost+" "+color);
}
public void taste()
{
System.out.println("To prepare tastey food ");
}
}
