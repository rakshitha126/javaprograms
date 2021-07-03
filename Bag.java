class Bag
{
String name;
String color;
int price;
int space;
public Bag(String nm,String cl,int pr,int sp)
{
System.out.println("Bag objective is created");
name=nm;
color=cl;
price=pr;
space=sp;
}
public void store()
{
System.out.println(" ");
}
public void printBagDetails()
{
System.out.println(name+" "+color+" "+price+" "+space);
}
public void toKeep()
{
System.out.println("To store books");
}
}