class Yoga
{
String name;
String type;
int level;
int stage;
public Yoga(String nm,String ty,int lvl,int stg)
{
System.out.println("yoga objective is created");
name=nm;
type=ty;
level=lvl;
stage=stg;
}
public void health()
{
System.out.println(" ");
}
public void printYogaDetails()
{
System.out.println(name+" "+type+" "+level+" "+stage);
}
public void goodHealth()
{
System.out.println("To build good body");
}
}