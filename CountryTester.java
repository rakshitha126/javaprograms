class CountryTester{
public static void main(String a[])
{
Country country=new Country("India",30,1300000000L,9);
country.printCountryDetails();
Country ct=new Country("Russia",21,1200000000L,9);
ct.printCountryDetails();
country.giveCitizenShip();
country.develop();
}
}