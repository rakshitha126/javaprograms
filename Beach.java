class Beach
{
    String name;
    String location;
    boolean isBoatingAvailable;
    String type;
    
    public Beach() {
        this("Malpe Beach", "Updupi", true, "Sandy beach");
        System.out.println("Beach with zero parameters");
    }
    
    public Beach(String name,String location,  boolean isBoatingAvailable, 
 String type) {
        System.out.println("Beach with  parameters");
        this.name = name;
        this.location = location;
        this.isBoatingAvailable = isBoatingAvailable;
        this.type= type;
        
        System.out.println( this.name+" "+ this.location+" "+ this.isBoatingAvailable+" "+ 
  this.type);
    }
    
    public void enjoy() {
        System.out.println("Enjoy....");
    }
    
    public void enjoy(String Boating) {
        System.out.println("Enjoying with friends with"+Boating);
    }
}