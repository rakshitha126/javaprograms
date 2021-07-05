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

Liquid liquid=new Water();
liquid.Color=Color;
liquid.ChemicalFormula=ChemicalFormula;
liquid.isStorable=isStorable;
liquid.solvents();


System.out.println(Color+" "+ChemicalFormula+" "+isStorable);
}

}
