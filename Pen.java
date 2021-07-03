class Pen
{
String name;
String ink;
String color;
int price;
public Pen(String nm,String ik,String clr,int pe)
{
System.out.println("pen received");
name=nm;
ink=ik;
color=clr;
price=pe;
}
public void fetchPen()
{
System.out.println(" ");
}
public void printPenDetails()
{
System.out.println(name+" "+ink+" "+color+" "+price);
}
public void write()
{
System.out.println("writing something");
}
}