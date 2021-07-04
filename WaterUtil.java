import java.util.Scanner;
class WaterUtil{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the color");
String Color=sc.nextLine();
System.out.println("Enter the chemical formula");
String ChemicalFormula=sc.nextLine();
System.out.println("Is it storable?");
boolean isStorable=sc.nextBoolean();
sc.close();
System.out.println(Color);
Water water=new Water();
water.Color=Color;
water.ChemicalFormula=ChemicalFormula;
water.isStorable=isStorable;

System.out.println(water.Color+" "+water.ChemicalFormula+" "+water.isStorable);
}

}
