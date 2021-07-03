class BeveragesTester{
public static void main(String a[])
{
Beverages bg=new Beverages("Mangomilkshake","milkshake", 40,"yellow");
bg.printBeveragesDetails();
Beverages bs=new Beverages("sprite","juice",60,"Colourless");
bs.printBeveragesDetails();
bg.drink();
bg.thirst();
}
}