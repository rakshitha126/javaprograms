import java.util.Scanner;
class TreeUtil{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the treeId");
int treeId=sc.nextInt();
System.out.println("enter the name");
String name=sc.next();
System.out.println("enter the price");
double price=sc.nextDouble();
System.out.println("enter the color");
String color=sc.next();
sc.close();
System.out.println(treeId);
Cocanut cocanut=new Cocanut();
cocanut.treeId=treeId;
cocanut.name=name;
cocanut.price=price;
cocanut.color=color;
System.out.println(cocanut.treeId+" "+cocanut.name+" "+cocanut.price+" "+cocanut.color);
}
}