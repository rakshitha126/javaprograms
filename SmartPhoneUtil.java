import java.util.Scanner;
class SmartPhoneUtil{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the smartphoneId");
int smartphoneId=sc.nextInt();
System.out.println("enter the name");
String name=sc.next();
System.out.println("enter the price");
double price=sc.nextDouble();
System.out.println("enter the color");
String color=sc.next();
sc.close();
System.out.println(smartphoneId);
IPhone iphone=new IPhone();
iphone.smartphoneId=smartphoneId;
iphone.name=name;
iphone.price=price;
iphone.color=color;
System.out.println(iphone.smartphoneId+" "+iphone.name+" "+iphone.price+" "+iphone.color);
}
}