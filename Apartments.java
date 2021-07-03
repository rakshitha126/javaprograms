class Apartments{
String name;
int number;
boolean isAvailable;
String color;
int price;
String location;
public Apartments(){
this("Malik",2597,true,"brown",90589,"mysore");
System.out.println("Apartments object is created with zero parameters");
System.out.println();
}
public Apartments(String name,int number,boolean isAvailable,String color,int price,String location)
{
System.out.println("Apartments with parameters");
this.name=name;
this.number=number;
this.isAvailable=isAvailable;
this.color=color;
this.price=price;
this.location=location;
System.out.println(this.name+" "+this.number+" "+this.isAvailable+" "+this.color+" "+this.price+" "+this.location);
}
public void newApartments(){
System.out.println("found new apartment.....found new apartment and found new apartment");
}
public void newApartments(String location)
{
System.out.println("infrastructure is to good");
}
}