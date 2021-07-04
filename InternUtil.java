import java.util.Scanner;
class InternUtil{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Employee Id");
String EmployeeId=sc.nextLine();
System.out.println("Enter the Role");
String Role=sc.nextLine();
System.out.println("Enter the number of year experience");
String experience=sc.nextLine();
sc.close();
System.out.println(EmployeeId);
Intern intern=new Intern();
intern.EmployeeId=EmployeeId;
intern.Role=Role;
intern.experience=experience;
System.out.println(intern.EmployeeId+" "+intern.Role+" "+intern.experience);
}

}