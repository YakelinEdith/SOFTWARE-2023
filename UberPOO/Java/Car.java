class Car {

       int passenger;
       String license;
       Account account;
           
        public Car(String license, Account account) {
               
          this.license= license;
          this.account= account;
               
                      
        }

    
    void printDataCar() {
        System.out.println("Number license: "+ license +" Name driver : " + account.name);
        ; 
    }
    
}
