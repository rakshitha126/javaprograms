class Drawing
{
String type;
String name;
String color;
int pageSize;
public Drawing(String tp,String nm,String clr,int ps)
{
System.out.println("drawing done");
type=tp;
name=nm;
color=clr;
pageSize=ps;
}
public void fetchDrawing()
{
System.out.println(" ");
}
public void printDrawingDetails()
{
System.out.println(type+" "+name+" "+color+" "+pageSize);
}
public void working()
{
System.out.println("wonderful art");
}
}