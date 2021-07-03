class BagTester{
public static void main(String a[])
{
Bag bag=new Bag("hp","black", 2500,5);
bag.printBagDetails();
Bag bg=new Bag("dell","blue",6500,9);
bg.printBagDetails();
bag.store();
bag.toKeep();
}
}