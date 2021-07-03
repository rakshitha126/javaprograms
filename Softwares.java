class Softwares{
int softwareId;
String name;
String type;
boolean isOpenSource;
public Softwares(int softwareId,String name,String type,boolean isOpenSource){
this.softwareId=softwareId;
this.name=name;
this.type=type;
this.isOpenSource=isOpenSource;
}
public static void easeOfWork()
{
}
public void printSoftwaresDetails(){
System.out.println(softwareId+" "+name+" "+type+" "+isOpenSource);
}
}