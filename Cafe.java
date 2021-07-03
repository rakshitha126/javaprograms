class Cafe{
String name;
String cafeName;
boolean isOpenOrNot;
String foodColor;
int price;
String taste;
public Cafe(){
this("Milkshake","sutra",true,"brown",90,"chilled");
System.out.println("Cafe object is created with zero parameters");
System.out.println();
}
public Cafe(String name,String cafeName,boolean isOpenOrNot,String foodColor,int price,String taste)
{
System.out.println("Cafe with parameters");
this.name=name;
this.cafeName=cafeName;
this.isOpenOrNot=isOpenOrNot;
this.foodColor=foodColor;
this.price=price;
this.taste=taste;
System.out.println(this.name+" "+this.cafeName+" "+this.isOpenOrNot+" "+this.foodColor+" "+this.price+" "+this.taste);
}
public void newCafe(){
System.out.println("enjoying with friends.....enjoying with friends and enjoying with friends");
}
public  void newCafe(String taste)
{
System.out.println("food is to good");
}
}