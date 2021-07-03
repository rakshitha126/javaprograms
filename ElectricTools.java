class ElectricTools{
String name;
String measure;
int cost;
String types;



public ElectricTools(){
this("Multimeter","voltage and current resistance",1000, "analog and digital");
System.out.println("ElectricTools with zero parameters");
}
public ElectricTools(String name,String measure,int cost,String types){

System.out.println("ElectricTools with  parameters");
this.name=name;
this.measure=measure;
this.cost=cost;
this.types=types;



System.out.println(this.name+" "+this.measure+" "+this.cost+" "+this.types);
}

public void repair(){
  System.out.println("repair..");
}
public void repair(String safetymeasures){
System.out.println("use with"+safetymeasures);
}
}
