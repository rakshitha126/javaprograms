import java.util.Arrays;
class Hospital1
{
private String name;
public PatientDTO[] patients;
private int index;
public Hospital1(int size)
{
patients=new PatientDTO[size];
System.out.println(this.getClass().getSimpleName()+"object is created");
}
public void savePatients(PatientDTO patients)
{
if(patients!=null)
{
System.out.println("adding Patient Details");
this.patients[index]=patients;
index++;
}
else
{
System.out.println("Patient Details are empty....Please add the patient details");
}
}
public void getPatients()
{
for(int i=0;i<patients.length;i++)
{
if(patients[i]!=null)
{
System.out.println(patients[i].getPatients()+" "+patients[i].getName()+" "+patients[i].getAddress()+" "+patient.getAge()+" "+patient.getMobileNo());
}
else
{
System.out.println("no patient found");
}
}
}
public boolean updatePatientMobileNoByPatientId(long mobileNo,String patientId)
{
System.out.println("invoked updatedPatientsMobileNoByPatientId");
boolean updateMobileNo=false;
for(int i=0;i<patients.length;i++)
{
if(patients[i]!=null)
{
if(patientId.equals(patients[i].getPatientId()))
{
patients[i].setMobileNo(mobileNo);
System.out.println("MobileNo updated");
updatedMobileNo=true;
}
}
}
return updatedMobileNo;
}
public boolean deletePatientById(String patientId)
{
System.out.println("invoked deletePatientById");
boolean deleted=false;
for(int i=0;i<patients.length;i++)
{
if(patients[i]!=null)
{
System.out.println(patients[i].getPatientId()+" "+patients[i].getName()+" "+patients[i].getAddress()+" "+patient.getAge()+" "+patient.getMobileNo());
}
}
return stateName;
}
}