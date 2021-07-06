class Engineer{

public String USN;
public Constants branch=Constants.ARCH;


public void problemSolving(){
System.out.println("invoked problemSolving()");
System.out.println("problem solved");
}

//setter Initialization
public void setUSN(String USN){
this.USN=USN;
}

//getter method
public String getUSN(){

return USN;

}

public Constants getBranch(){
return branch;
}
}