import java.util.Scanner;
class HospitalTester{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size");
int size=sc.nextInt();
Hospital hospital=new Hospital(size);

PatientDTO dto=new PatientDTO();
dto.setName("Hemanth");
dto.setPatientId("1");
dto.setAge(45);
dto.setMobileNo(7874634109L);
String addressDetails[]={"Hampinagar,Banglore-560040","Hubbali,Bangalore-789789"};
AddressDTO address=new AddressDTO();

/*PatientDTO patient=new PatientDTO();
patient.setName("Kishan");
patient.setPatientId("2");
patient.setAge(55);
patient.setMobileNo(7788291021L);
String addressDetails1[]={"vijayanagar,Banglore-560040","kulburgi,Bangalore-789782"};
AddressDTO address=new AddressDTO();*/


CountryDTO country=new CountryDTO();
country.setCountryName("India");
 StateDTO state=new StateDTO();
state.setStateName("karnataka");
CityDTO city=new CityDTO();
 city.setCityName("Banglore");
AreaDTO area=new AreaDTO();
area.SetAreaName("Indiranagar");
StreetDTO street=new StreetDTO();
street.setStreetName("hal road");
String streetNo[]={"34","567"};
street.setStreetNo(streetNo);


StateDTO state1=new StateDTO();
state1.setStateName("Rajasthan");
CityDTO city1=new CityDTO();
city1.setAreaName("Udaipur");
AreaDTO area1=new AreaDTO();
area1.setAreaName("Sector14");
StreetDTO street1=new StreetDTO();
street1.setStreetName("babanagar");
String streetNo1[]={"56","89"};
street1.setStreetNo(streetNo1);

StreetDTO streets[]={street,street1};
area.setStreets(streets);
AreaDTO areas[]={area,area1};
city.setAreas(areas);
CityDTO cities[]={city,city1};
state.setCities(cities);
StateDTO states[]={state,state1};
country.setStates(states);
address.setCountries(country);
dto.setAddress(address);
hospital.savePatients(dto);
hospital.savePatients(patient);
hospital.getPatients();

boolean updateMobileNo=hospital.updatePatientsMobileNoByPatientId(8866728109L,"1");
System.out.println(updateMobileNo);
hospital.getPatients();

hospital.deletePatientById("1");
hospital.getPatients();

hospital.getPatientByName("Hemanth");
hospital.getPatientAgeByName("Kishan");

System.out.println(stateName);

}
}