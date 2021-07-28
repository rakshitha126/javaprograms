class LightFactory
{
public static Switch getLight(String input)
{
if(input.equalsIgnoreCase("TubeLight"))
{
return new TubeLightImplementation();
}
else if(input.equalsIgnoreCase("CflBulb"))
{
return new CflBulbImplementation();
}
else
{
System.out.println("No Light Found");
}
return null;
}
}