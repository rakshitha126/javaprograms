class ResearchCenter{
String color;
String name;
String type;
boolean willGiveResult;
public ResearchCenter(String color,String name,String type,boolean willGiveResult){
this.color=color;
this.name=name;
this.type=type;
this.willGiveResult=willGiveResult;
}
public static void giveResult()
{
}
public void printResearchCenterDetails(){
System.out.println(color+" "+name+" "+type+" "+willGiveResult);
}
}