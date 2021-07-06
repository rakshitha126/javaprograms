class CSEngineer extends Engineer{

Constants branch=Constants.CS;

@Override
public void problemSolving(){
super.problemSolving();
super.setUSN("1APPCIV8907");
System.out.println(super.getUSN());
System.out.println("invoked problemSolving method of"+this.branch);
}
public void coding(){
System.out.println("invoked coding in CS");
}
public Constants getBranch(){
return branch;
}
}