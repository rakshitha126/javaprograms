import java.util.*;
class YouTubeUtil{
	
	public static void main(String a[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Accounts array");
	int size=sc.nextInt();
	YouTube youtube=new YouTube(size);
	
	for(int i=0;i<size;i++){
		System.out.println("Enter the Id");
		int accountsId=sc.nextInt();
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the Type");
		String type=sc.next();
		System.out.println("Enter the Size In Mb");
		String sizeInMb=sc.next();
		System.out.println("Is Internet required");
		String internetRequired=sc.next();
		
		AccountsDTO dto=new AccountsDTO();
		dto.setAccountsId(accountsId);
		dto.setName(name);
		dto.setType(type);
		dto.setSizeInMb(sizeInMb);
		dto.isInternetRequired(Boolean.parseBoolean(internetRequired));
		
		System.out.println(youtube.createAccounts(dto));
		
		
	}
	youtube.getAccounts();
	
	System.out.println("Enter the Name");
	String name1=sc.next();
	System.out.println("Enter the Size");
	String size1=sc.next();
	System.out.println(youtube.updateAccountSizeByName(size1,name1));
	
	youtube.getAccounts();
	/*System.out.println("Enter the accountsId");
	int accountsId1=sc.nextInt();
	System.out.println(youtube.deleteaccountsById( accountsId1));
	
	youtube.getAccounts();*/
	System.out.println("Enter the accountId");
	int accountsId1=sc.nextInt();
	System.out.println(youtube.getaccountsById( accountsId1));
	
	youtube.getAccounts();
	}
}