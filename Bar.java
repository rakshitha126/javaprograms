class Bar{
int barId;
String name;
String address;
public Bar(int barId,String name,String address){
this.barId=barId;
this.name=name;
this.address=address;
}
public void relax(){
System.out.println("relaxing with friends");
}
public void printBarDetails(){
System.out.println(this.barId+ " "+this.name+" "+this.address);
}
}