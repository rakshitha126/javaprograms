class HallTicket
{
String ticketNo;
int noOfSubjects;
String candidateName;
public HallTicket(String ticketNo,int noOfSubjects,String candidateName){
this.ticketNo=ticketNo;
this.noOfSubjects=noOfSubjects;
this.candidateName=candidateName;
}
public void displayHallTicketDetails()
{
System.out.println("invoked displayDetails()");
System.out.println(ticketNo);
System.out.println(noOfSubjects);
System.out.println(candidateName);
}
}