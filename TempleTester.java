class TempleTester{
public static void main(String a[])
{
Temple temple=new Temple();
temple.name="udpiKrishna";
temple.god="krishna";
temple.place="udpi";
temple.distance=150;
System.out.println(temple.name+" "+temple.god+" "+temple.place+" "+temple.distance);
Temple templ=new Temple();
templ.name="chamundibetta";
templ.god="chamundeswari";
templ.place="mysore";
templ.distance=12;
System.out.println(templ.name+" "+templ.god+" "+templ.place+" "+templ.distance);
Temple temp=new Temple();
temp.name="shirdi";
temp.god="saibaba";
temp.place="maharashtra";
temp.distance=996;
System.out.println(temp.name+" "+temp.god+" "+temp.place+" "+temp.distance);
temple.pray();
temple.prasad();
}
}