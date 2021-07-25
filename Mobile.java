class YouTube{

private AccountsDTO[] accounts;
private int ind;

public YouTube(int size){
  accounts=new AccountsDTO[size];
  }
  
public boolean createAccounts(AccountsDTO accounts){
boolean dataCreated=false;
  System.out.println("invoked createAccounts");
if(accounts!=null){
	if(accounts.getName()!=null && accounts.getAccountsId()>0){
    this.accounts[ind++]=accounts;
	dataCreated=true;
	}
  else{
	System.out.println("Id must be greater than zero");
}
}

System.out.println("createAccounts ended");
return dataCreated;
}

public void getAccounts(){
	System.out.println("invoked getAccounts");
for(AccountsDTO accountDTO:accounts)
	if(accountDTO!=null){
		System.out.println(accountDTO.getAccountsId()+" "+accountDTO.getName()+" "+accountDTO.getType()+" "+accountDTO.getSizeInMb()+" "+accountDTO.getInternetRequired());
	
	}
	else{
		System.out.println("Accounts DTO object not found");
	}
}


public boolean updateAccountSizeByName(String sizeInMb,String name){
boolean sizeUpdated=false;
	System.out.println("invoked updateAccountSizeByName");
	for(AccountsDTO dto1:accounts){
	if(name!=null && sizeInMb!=null ){
		if(name.equals(dto1.getName())){
			dto1.setSizeInMb("sizeInMb");
			sizeUpdated=true;
		}
	}
	}
	return sizeUpdated;
}
/*public boolean deleteaccountsById(int accountsId){
System.out.println("invoked deleteaccountsById()");
boolean deleted=false;
for(int i=0;i<accounts.length;i++){
	if(accounts[i]!=null){
	      if(accountsId==accounts[i].getAccountsId()){
	          accounts[i]=null;
	          deleted=true;
	      }
                }
      }
return deleted;
}*/

public boolean getaccountsById(int accountsId){
System.out.println("getaccountsById()");
boolean accountsdata=false;

for(AccountsDTO account:accounts){
if(account!=null){
if(accountsId==account.getAccountsId()){
	
	          
                   

        
    System.out.println(account.getAccountsId()+" "+account.getName()+" "+account.getType()+" "+account.getSizeInMb()+" "+account.getInternetRequired() );
    accountsdata=true;
}
}
}
return accountsdata;

}
  
  
  
  
  }