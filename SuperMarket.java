class SuperMarket{
public static void main(String a[])
{
String[] perfume={"fogg","Secret","wild stone","engage","yardley"};
System.out.println(perfume[0]+" "+perfume[2]+" "+perfume[3]+" "+perfume[4]);
System.out.println(perfume.length);
String VegetablesAndFruits[]={"tomato","apple","potato","strawberry","pumpkin","mango","dragonfruit","litchie","carrot","kiwi","bitterguard"};
int amountPerkg[]={12,100,20,120,40,100,60,80,30,120,89};
System.out.println(vegetablesAndFruits.length);
String value=fetchVegetablesAndPrice(vegetablesAndFruits,amountPerkg);
}
public static String fetchVegetablesAndPrice(String veggie[],int amount[])
{
String veggieWithAmount=0;
for(int i=0;i<veggie.length;i++)
veggieWithAmount=veggie[i]+amount[i];
}
return veggieWithAmount;
}