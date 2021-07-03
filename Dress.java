class Dress
{
String type;
String name;
String color;
int size;
public Dress(String tp,String nm,String clr,int sz)
{
System.out.println("Searching");
type=tp;
name=nm;
color=clr;
size=sz;
}
public void getDress()
{
System.out.println(" ");
}
public void printDressDetails()
{
System.out.println(type+" "+name+" "+color+" "+size);
}
public void searching()
{
System.out.println("wonderful dress");
}
}