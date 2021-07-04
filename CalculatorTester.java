import java.util.Scanner;
class CalculatorTester{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the name");
String name=sc.next();
System.out.println("enter the model");
String model=sc.next();
ScientificCalculator scienca=new ScientificCalculator();
scienca.name=name;
scienca.model=model;
scienca.add(1,3);
scienca.sub(9,6);
scienca.sin(90);
scienca.cos(90);
}
}