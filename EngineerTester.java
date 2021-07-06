class EngineerTester
{
public static void main(String a[]){
 Engineer engineer=new Engineer();
engineer.setUSN("1rv18ec056");
engineer.problemSolving();
System.out.println(engineer.getUSN());
CSEngineer csEngineer=new CSEngineer();
System.out.println(csEngineer.getBranch());
csEngineer.problemSolving();
CivilEngineer civEngineer=new CivilEngineer();
System.out.println(civEngineer.getBranch());
civEngineer.problemSolving();
System.out.println("************************");
Engineer engineer2=new CivilEngineer();
System.out.println(engineer2.getBranch());
Engineer engineer3=new CSEngineer();
System.out.println(engineer3.getBranch());
}
}
