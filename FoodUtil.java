import java.util.Scanner;
class FoodUtil{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the food id");
int foodId=sc.nextInt();
System.out.println("enter the food taste");
String foodTaste=sc.next();
System.out.println("enter the price");
double price=sc.nextDouble();
System.out.println("eter the no of expDate");
int expDate=sc.nextInt();
sc.close();
System.out.println(foodId);
Maggi maggi=new Maggi();
maggi.foodId=foodId;
maggi.price=price;
maggi.expDate=expDate;
System.out.println(maggi.foodId+" "+maggi.price+" "+maggi.expDate);
}
}