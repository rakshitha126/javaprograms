class Scientists{
String name;
String location;
boolean isResultAvailable;
int date;
int awards;
public Scientists(){
this("Albert Einstein","USA",true,26,4);
System.out.println("Scientists object is created with zero parameters");
System.out.println();
}
public Scientists(String name,String location,boolean isResultAvailable,int date,int awards)
{
System.out.println("Scientists with parameters");
this.name=name;
this.location=location;
this.isResultAvailable=isResultAvailable;
this.date=date;
this.awards=awards;
System.out.println(this.name+" "+this.location+" "+this.isResultAvailable+" "+this.date+" "+this.awards);
}
public void success(){
System.out.println("Success.....Success and Success");
}
public void success(String award)
{
System.out.println("Reached his goal");
}
}