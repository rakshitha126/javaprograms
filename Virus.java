class Virus{
String name;
String color;
String code;
boolean willSpread;
public Virus(String name,String color,String code,boolean willSpread){
this.name=name;
this.color=color;
this.code=code;
this.willSpread=willSpread;
}
public static void Destroy()
{
}
public void printVirusDetails(){
System.out.println(name+" "+color+" "+code+" "+willSpread);
}
}