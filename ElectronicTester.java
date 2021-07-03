class ElectronicTester{
public static void main(String a[])
{
Electronic electronic=new Electronic("ironbox","black", 2500,"black");
electronic.printElectronicDetails();
Electronic electro=new Electronic("hairstraightner","blue",6500,"red");
electro.printElectronicDetails();
electronic.heat();
electronic.toUse();
}
}