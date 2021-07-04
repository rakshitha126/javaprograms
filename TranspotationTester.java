class TranspotationTester{
public static void main(String a[])
{
Transpotation transpotation=new Transpotation();
transpotation.vehicle="train";
transpotation.modes="railwayTransport";
transpotation.place="udpi";
transpotation.distance=150;
System.out.println(transpotation.vehicle+" "+transpotation.modes+" "+transpotation.place+" "+transpotation.distance);
Transpotation transpo=new Transpotation();
transpo.vehicle="flight";
transpo.modes="airTransport";
transpo.place="mumbai";
transpo.distance=195;
System.out.println(transpo.vehicle+" "+transpo.modes+" "+transpo.place+" "+transpo.distance);
Transpotation trans=new Transpotation();
trans.vehicle="sheep";
trans.modes="waterTransport";
trans.place="maharashtra";
trans.distance=996;
System.out.println(trans.vehicle+" "+trans.modes+" "+trans.place+" "+trans.distance);
transpotation.transfer();
transpotation.place();
}
}