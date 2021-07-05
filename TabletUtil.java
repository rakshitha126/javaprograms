import java.util.Scanner;

class TabletUtil{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the medicine Id:");
String MedicineId=sc.nextLine();
System.out.println("Enter the Price");
int Price=sc.nextInt();
System.out.println("Enter the type of medicine");
String type=sc.nextLine();
sc.close();
Medicine medicine=new Tablet();
medicine.MedicineId=MedicineId;
medicine.Price=Price;
medicine.type=type;
medicine.CureADisease();

System.out.println(MedicineId+" "+Price+" "+
type);
}
}
