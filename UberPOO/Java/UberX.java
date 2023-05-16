public class UberX {


    String license;
    Account account;
    String brand;
    String model;
   
  
    public UberX(String license, Account account, String  brand, String model) {
       
        this.license= license;
        this.account= account;
        this.brand = brand;
        this.model= model;   
    }

    public void printDataUberX(){
        System.out.println("Number license: "+ license + " Name driver : "+ account.name + "  Brand : "+ brand + "  Model: "+ model );
    }
     
}

