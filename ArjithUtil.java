import java.util.Scanner;
class ArjithUtil{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the DOB");
String DOB=sc.nextLine();
System.out.println("Enter the Number of awards");
int noOfAwards=sc.nextInt();
System.out.println("Enter the Languages in which Arjith have sung");
String LanguagesSung=sc.nextLine();
sc.close();
System.out.println(DOB);
Arjith arjith=new Arjith();
arjith.DOB=DOB;
arjith.noOfAwards=noOfAwards;
arjith.LanguagesSung=LanguagesSung;
System.out.println(arjith.DOB+" "+arjith.noOfAwards+" "+arjith.LanguagesSung);
}

}
