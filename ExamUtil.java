class ExamUtil
{
public static void main(String a[])
{
Exam exam=new Exam();
exam.code="17EC81";
exam.fees=999;
HallTicket hallTicket=new HallTicket("3wer6bd",5,"snxbh");
boolean allowed=exam.allow(hallTicket);
if(allowed)
{
System.out.println("can write exam");
}
else
{
System.out.println("cannot write exam");
}
System.out.println("********************************");
Exam suplementaryExam=new SuplementaryExam();
boolean allowedForSuplementary=suplementaryExam.allow(hallTicket);
if(allowedForSuplementary){
System.out.println("can write suplementary exam");
}
else
{
System.out.println("cannot write suplementary exam");
}
}
}