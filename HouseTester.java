class HouseTester{

public static void main(String a[]){
House town1=new House();
town1.siteId=67;
town1.address="Rajajinagar";
System.out.println(town1.noOfHouseNumber);
System.out.println(town1.hashCode());
House town=new House();
System.out.println(town1.noOfHouseNumber);
town.siteId=678;
town.address="rajajinagar";
System.out.println(town1.hashCode());
boolean type=town.equals(town);

System.out.println(town.noOfHouseNumber);

System.out.println(type);
}
}
