class AtmTester
{
public static void main(String a[])
{
AtmMachine atm=new AtmMachine();
Atm sbi=new SbiAtm();
atm.slot(sbi);
Sbi s=new SbiAtm();
s.createAccount();
}
}