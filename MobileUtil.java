import java.util.*;
class MobileUtil{
	
	public static void main(String a[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Apps array");
	int size=sc.nextInt();
	Mobile mobile=new Mobile(size);
	
	for(int i=0;i<size;i++){
		System.out.println("Enter the Id");
		int appsId=sc.nextInt();
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the Type");
		String type=sc.next();
		System.out.println("Enter the Size In Mb");
		String sizeInMb=sc.next();
		System.out.println("Is Internet required");
		String internetRequired=sc.next();
		
		AppsDTO dto=new AppsDTO();
		dto.setAppsId(appsId);
		dto.setName(name);
		dto.setType(type);
		dto.setSizeInMb(sizeInMb);
		dto.isInternetRequired(Boolean.parseBoolean(internetRequired));
		
		System.out.println(mobile.createApps(dto));
		
		
	}
	mobile.getApps();
	
	System.out.println("Enter the Name");
	String name1=sc.next();
	System.out.println("Enter the Size");
	String size1=sc.next();
	System.out.println(mobile.updateAppSizeByName(size1,name1));
	
	mobile.getApps();
	/*System.out.println("Enter the appId");
	int appsId1=sc.nextInt();
	System.out.println(mobile.deleteappsById( appsId1));
	
	mobile.getApps();*/
	System.out.println("Enter the appId");
	int appsId1=sc.nextInt();
	System.out.println(mobile.getappsById( appsId1));
	
	mobile.getApps();
	}
}