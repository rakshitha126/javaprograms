class House{

public int siteId=67;
public String address="Rajajinagar";
public String place="SDFH678901";
public int HouseNumber=100;

public House(){
System.out.println();
}

public Number giveLoanOnRateOfinterest(){
return 5;
}

@Override
public int hashCode(){
return this.siteId;
}

@Override
public boolean equals(Object house){
if(house instanceof House){

return true;
}

else{
System.out.println("Not a same type");
return false;
}
}
}