class DessertTester{
public static void main(String a[])
{
Dessert dessert=new Dessert("WhiteForest","cake", 55,"white");
dessert.printDessertDetails();
Dessert Dst=new Dessert("DBC","icecream",200,"ChoclateBrown");
Dst.printDessertDetails();
dessert.sweet();
dessert.taste();
}
}