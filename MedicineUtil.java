import java.util.Scanner;
class MedicineUtil{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the medicine id");
int medicineId=sc.nextInt();
System.out.println("enter the price");
double price=sc.nextDouble();
System.out.println("enter the name");
String name=sc.next();
System.out.println("eter the no of expDate");
int expDate=sc.nextInt();
sc.close();
System.out.println(medicineId);
Medicine medicine=new Medicine ();
medicine.medicineId=medicineId;
medicine.price=price;
medicine.name=name;
medicine.expDate=expDate;
System.out.println(medicine.medicineId+" "+medicine.price+" "+medicine.name+" "+medicine.expDate);
}
}