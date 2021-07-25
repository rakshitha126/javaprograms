class Bank{

private BranchsDTO[] branchs;
private int ind;

public Bank(int size){
  branchs=new BranchsDTO[size];
  }
  
public boolean createBranchs(BranchsDTO branchs){
boolean dataCreated=false;
  System.out.println("invoked createBranchs");
if(branchs!=null){
	if(branchs.getName()!=null && branchs.getBranchsId()>0){
    this.branchs[ind++]=branchs;
	dataCreated=true;
	}
  else{
	System.out.println("Id must be greater than zero");
}
}

System.out.println("createBranchs ended");
return dataCreated;
}

public void getBranchs(){
	System.out.println("invoked getBranchs");
for(BranchsDTO branchDTO:branchs)
	if(branchDTO!=null){
		System.out.println(branchDTO.getBranchsId()+" "+branchDTO.getName()+" "+branchDTO.getType()+" "+branchDTO.getSizeInMb()+" "+branchDTO.getInternetRequired());
	
	}
	else{
		System.out.println("Branchs DTO object not found");
	}
}


public boolean updateBranchsSizeByName(String sizeInMb,String name){
boolean sizeUpdated=false;
	System.out.println("invoked updateBranchsSizeByName");
	for(BranchsDTO dto1:branchs){
	if(name!=null && sizeInMb!=null ){
		if(name.equals(dto1.getName())){
			dto1.setSizeInMb("sizeInMb");
			sizeUpdated=true;
		}
	}
	}
	return sizeUpdated;
}
/*public boolean deletebranchsById(int branchsId){
System.out.println("invoked deletebranchsById()");
boolean deleted=false;
for(int i=0;i<branchs.length;i++){
	if(branchs[i]!=null){
	      if(branchsId==branchs[i].getBranchsId()){
	          branchs[i]=null;
	          deleted=true;
	      }
                }
      }
return deleted;
}*/

public boolean getbranchsById(int branchsId){
System.out.println("getbranchsById()");
boolean branchsdata=false;

for(BranchsDTO branch:branchs){
if(branch!=null){
if(branchsId==branch.getBranchsId()){
	
	          
                   

        
    System.out.println(branch.getBranchsId()+" "+branch.getName()+" "+branch.getType()+" "+branch.getSizeInMb()+" "+branch.getInternetRequired() );
    branchsdata=true;
}
}
}
return branchsdata;

}
  
  
  
  
  }