class BankUtil{
	
	public static void main(String a[]){
		
		Bank sbi=new Bank();
		Bank sbi1=new Bank();
		boolean type =sbi1.equals(sbi);
		System.out.println(type);
		
		Bank s=new Bank();
		boolean type2=sbi.equals(s);
		System.out.println(type2);
		
		Object obj=new Bank();
		boolean type3=sbi.equals(obj);
		System.out.println(type3);
		

		Bank sb =new SbiBank();
		SbiBank sbiBank =(SbiBank)sb;
		sbiBank.displayDetails();
		System.out.println(sbiBank.provideLoanOnRateOfInterest());
	    boolean type1 =sbi1.equals(sb);
		System.out.println(type1);
		
	}
	
	
	}