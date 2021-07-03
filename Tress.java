class Tress{
int size;
String name;
String type;
boolean willGiveFlower;
public Tress(int size,String name,String type,boolean willGiveFlower){
this.size=size;
this.name=name;
this.type=type;
this.willGiveFlower=willGiveFlower;
}
public static void fetchTressColor()
{
}
public void printTressDetails(){
System.out.println(size+" "+name+" "+type+" "+willGiveFlower);
}
}