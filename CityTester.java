class CityTester{
public static void main(String a[])
{
City city=new City("mysore","red", 250,5);
city.printCityDetails();
City cy=new City("bangalore","blue",650,9);
cy.printCityDetails();
city.place();
city.toSee();
}
}