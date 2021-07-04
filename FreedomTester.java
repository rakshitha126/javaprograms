class FreedomTester{
public static void main(String a[])
{
Freedom freedom=new Freedom();
freedom.name="mohandasKaramchand";
freedom.age=55;
freedom.surname="gandhi";
freedom.status="married";
System.out.println(freedom.name+" "+freedom.age+" "+freedom.surname+" "+freedom.status);
Freedom freed=new Freedom();
freed.name="bhagatSinghSandhu";
freed.age=25;
freed.surname="bhagowale";
freed.status="married";
System.out.println(freed.name+" "+freed.age+" "+freed.surname+" "+freed.status);
Freedom free=new Freedom();
free.name="BhimraoRamji ";
free.age=35;
free.surname="ambedkar";
free.status="married";
System.out.println(free.name+" "+free.age+" "+free.surname+" "+free.status);
freedom.savedIndia();
freedom.gaveFreedom();
}
}