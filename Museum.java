class Museum{
String name;
String color;
String resName;
int decades;
public Museum(String name,String color,String resName,int decades){
this.name=name;
this.color=color;
this.resName=resName;
this.decades=decades;
}
public static void Exhibition()
{
}
public void printMuseumDetails(){
System.out.println(name+" "+color+" "+resName+" "+decades);
}
}