import java.util.Scanner;
class ProfessionUtil{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the proffId");
int proffId=sc.nextInt();
System.out.println("enter the name");
String name=sc.next();
System.out.println("enter the salary");
double salary=sc.nextDouble();
System.out.println("enter the lang");
String lang=sc.next();
sc.close();
System.out.println(proffId);
Teaching teach=new Teaching();
teach.proffId=proffId;
teach.name=name;
teach.salary=salary;
teach.lang=lang;
System.out.println(teach.proffId+" "+teach.name+" "+teach.salary+" "+teach.lang);
}
}