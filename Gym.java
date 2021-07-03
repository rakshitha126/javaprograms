class Gym{
String name;
String location;
String timing;
int totalNoOfTrainers;
String modeOfPayment;
public Gym(){
this("Lion's Gym","Mysore","6am-7am", 12, "cash and online payment");
System.out.println("Gym with zero parameters");
}
public Gym(String name,String location,String timing,
int totalNoOfTrainers,String modeOfPayment){
System.out.println("Gym with  parameters");
this.name=name;
this.location=location;
this.timing=timing;
this.totalNoOfTrainers=totalNoOfTrainers;
this.modeOfPayment=modeOfPayment;
System.out.println(this.name+" "+this.location+" "+this.timing+" "+
this.totalNoOfTrainers+" "+this.modeOfPayment);
}
public void fitness(){
  System.out.println("Fitness..");
}
public void fitness(String gymequipment){
System.out.println("workout with"+gymequipment);
}
}
