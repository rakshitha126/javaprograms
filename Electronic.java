class Electronic
{
String name;
String color;
int price;
String wireColor;
public Electronic(String nm,String cl,int pr,String wc)
{
System.out.println("Electronic objective is created");
name=nm;
color=cl;
price=pr;
wireColor=wc;
}
public void heat()
{
System.out.println(" ");
}
public void printElectronicDetails()
{
System.out.println(name+" "+color+" "+price+" "+wireColor);
}
public void toUse()
{
System.out.println("To heat things");
}
}