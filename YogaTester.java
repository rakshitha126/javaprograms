class YogaTester{
public static void main(String a[])
{
Yoga yoga=new Yoga("suryanamaskara","standing", 2,5);
yoga.printYogaDetails();
Yoga yg=new Yoga("ardhamatsyendrasana","sitting",6,9);
yg.printYogaDetails();
yoga.health();
yoga.goodHealth();
}
}