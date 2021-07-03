class Jewellery{
String name;
String shopName;
boolean isGoldOrNot;
String design;
int price;
String color;
public Jewellery(){
this("Anklet","tulsi",true,"earings",400000);
System.out.println("Jewellery object is created with zero parameters");
System.out.println();
}
public Jewellery(String name,String shopName,boolean isGoldOrNot,String design,int price)
{
System.out.println("Jewellery with parameters");
this.name=name;
this.shopName=shopName;
this.isGoldOrNot=isGoldOrNot;
this.design=design;
this.price=price;
System.out.println(this.name+" "+this.shopName+" "+this.isGoldOrNot+" "+this.design+" "+this.price);
}
public void newJewellery(){
System.out.println("gotNewJewellery.....gotNewJewellery and gotNewJewellery");
}
public void newJewellery(String price)
{
System.out.println(" new ourniment");
}
}