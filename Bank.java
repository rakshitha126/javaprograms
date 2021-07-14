class Bank{
	
	public String address="Rajajinagar";
	public String ifscCode="SDFG1526341";
	public int noOfBranches=100;
	
	public Bank(){
		System.out.println();
	}
	
	public Object provideLoanOnRateOfInterest(){
		return "5%";
	}
	
	@Override
	public boolean equals(Object bank){
		if(bank instanceof Bank){
			return true;
		}else{
			System.out.println("Not a same type");
			return false;
		}
	}
	}