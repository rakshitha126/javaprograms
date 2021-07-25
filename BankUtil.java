import java.util.*;
class BankUtil{
	
	public static void main(String a[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Branchs array");
	int size=sc.nextInt();
	Bank bank=new Bank(size);
	
	for(int i=0;i<size;i++){
		System.out.println("Enter the Id");
		int branchsId=sc.nextInt();
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the Type");
		String type=sc.next();
		System.out.println("Enter the Size In Mb");
		String sizeInMb=sc.next();
		System.out.println("Is Internet required");
		String internetRequired=sc.next();
		
		BranchsDTO dto=new BranchsDTO();
		dto.setBranchsId(branchsId);
		dto.setName(name);
		dto.setType(type);
		dto.setSizeInMb(sizeInMb);
		dto.isInternetRequired(Boolean.parseBoolean(internetRequired));
		
		System.out.println(bank.createBranchs(dto));
		
		
	}
	bank.getBranchs();
	
	System.out.println("Enter the Name");
	String name1=sc.next();
	System.out.println("Enter the Size");
	String size1=sc.next();
	System.out.println(bank.updateBranchsSizeByName(size1,name1));
	
	bank.getBranchs();
	/*System.out.println("Enter the branchsId");
	int branchsId1=sc.nextInt();
	System.out.println(bank.deletebranchsById(branchsId1));
	
	bank.getBranchs();*/
	System.out.println("Enter the branchId");
	int branchsId1=sc.nextInt();
	System.out.println(bank.getbranchsById(branchsId1));
	
	bank.getBranchs();
	}
}