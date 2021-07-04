class SoldierTester{
public static void main(String a[])
{
Soldier solider=new Soldier();
solider.name="ram";
solider.count=55;
solider.height=159;
solider.age=25;
System.out.println(solider.name+" "+solider.count+" "+solider.height+" "+solider.age);
Soldier solide=new Soldier();
solide.name="dev";
solide.count=25;
solide.height=157;
solide.age=35;
System.out.println(solide.name+" "+solide.count+" "+solide.height+" "+solide.age);
Soldier solid=new Soldier();
solid.name="rashmi";
solid.count=15;
solid.height=160;
solid.age=28;
System.out.println(solid.name+" "+solid.count+" "+solid.height+" "+solid.age);
solider.saveIndia();
solider.Respect();
}
}