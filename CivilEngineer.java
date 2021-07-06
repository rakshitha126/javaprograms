class CivilEngineer extends Engineer{

Constants branch=Constants.CIVIL;

@Override
public void problemSolving(){
System.out.println("invoked problemSolving() of CivilEngineer");
System.out.println("problem solved by"+this.branch);
}
}