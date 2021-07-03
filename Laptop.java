class Laptop
{
String name;
String color;
int space;
int gen;
public Laptop(String nm,String cl,int spc,int ge)
{
System.out.println("laptop received");
name=nm;
color=cl;
space=spc;
gen=ge;
}
public void getLaptop()
{
System.out.println(" ");
}
public void printLaptopDetails()
{
System.out.println(name+" "+color+" "+space+" "+gen);
}
public void working()
{
System.out.println("useful");
}
}