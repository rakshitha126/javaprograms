import java.util.*;
class SwitchTester
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the light");
String input=sc.next();
Switch light=LightFactory.getLight(input);
if(light!=null)
{
light.sOn();
light.sOff();
}
}
}