import java.util.Scanner;
class LifesAmazingSecretUtil{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the novel id");
int novelId=sc.nextInt();
System.out.println("enter the author");
String author=sc.next();
System.out.println("eter the no of pages");
int noOfPages=sc.nextInt();
sc.close();
System.out.println(novelId);
LifesAmazingSecret lifes=new LifesAmazingSecret();
lifes.novelId=novelId;
lifes.author=author;
lifes.noOfPages=noOfPages;
System.out.println(lifes.novelId+" "+lifes.author+" "+lifes.noOfPages);
}
}