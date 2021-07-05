class SuplementaryExam extends Exam
{
public SuplementaryExam()
{
System.out.println("SuplementaryExam object is created");
}
@Override
public boolean allow(HallTicket hallTicket)
{
System.out.println("invoked allow from SuplementaryExam");
super.code="17EC81";
super.fees=1500;
return super.allow(hallTicket);
}
}