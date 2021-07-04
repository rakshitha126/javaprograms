import java.util.Scanner;
class SoftDrinksUtil{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the softdrinks id");
int softdrinksId=sc.nextInt();
System.out.println("enter the price");
double price=sc.nextDouble();
System.out.println("enter the name");
String name=sc.next();
System.out.println("eter the no of expDate");
int expDate=sc.nextInt();
sc.close();
System.out.println(softdrinksId);
SoftDrinks softdrinks=new SoftDrinks ();
softdrinks.softdrinksId=softdrinksId;
softdrinks.price=price;
softdrinks.name=name;
softdrinks.expDate=expDate;
System.out.println(softdrinks.softdrinksId+" "+softdrinks.price+" "+softdrinks.name+" "+softdrinks.expDate);
}
}