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

Actor act=new SRK();
act.ActorId=ActorId;
act.DOB=DOB;
act.noOfAwards=noOfAwards;
act.Entertainment();
System.out.println(ActorId+" "+DOB+" "+noOfAwards);
}

}
