class PlantTester{
public static void main(String a[])
{
Plant plant=new Plant("rose","red",10,"long");
plant.printPlantDetails();
Plant pn=new Plant("lily","purple",12,"small");
plant.printPlantDetails();
plant.fetchPlant();
plant.savePlant();
}
}