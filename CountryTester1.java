class CountryTester1{
public static void main(String a[])
{
Country cty=new Country("India",30,1300000000L,9);
cty.printCountryDetails();
Country ct=new Country("Russia",21,1200000000L,9);
ct.printCountryDetails();
Country.giveCitizenShip();
Country.develop();
}
}