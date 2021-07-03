class Theater{
String name;
String location;
boolean isBookingAvailable;
int totalNoOfSeats;
int noOfScreens;
int showsPerDay;
public Theater(){
this("Sangam","Mysore",true,961,1,4);
System.out.println("Theater object is created with zero parameters");
System.out.println();
}
public Theater(String name,String location,boolean isBookingAvailable,int totalNoOfSaeta,int noOfScreens,int showsPerDay)
{
System.out.println("Theater with parameters");
this.name=name;
this.location=location;
this.isBookingAvailable=isBookingAvailable;
this.totalNoOfSeats=totalNoOfSeats;
this.noOfScreens=noOfScreens;
this.showsPerDay=showsPerDay;
System.out.println(this.name+" "+this.location+" "+this.isBookingAvailable+" "+this.totalNoOfSeats+" "+this.noOfScreens+" "+this.showsPerDay);
}
public void entertainment(){
System.out.println("Enetrtainment......Enetrtainment and Enetrtainment");
}
public void entertainment(String popcorn)
{
System.out.println("Enjoying with friends with popcorn");
}
}