import java.util.Scanner;
class SRKUtil{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the ActorId");
String ActorId=sc.nextLine();
System.out.println("Enter the DOB");
String DOB=sc.nextLine();
System.out.println("Enter the number of awards");
int noOfAwards =sc.nextInt();
sc.close();
System.out.println(ActorId);
SRK srk=new SRK();
srk.ActorId=ActorId;
srk.DOB=DOB;
srk.noOfAwards=noOfAwards;
System.out.println(srk.ActorId+" "+srk.DOB+" "+noOfAwards);
}

}
