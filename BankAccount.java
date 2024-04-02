public class BankAccount {
    private double balance;
    

    public BankAccount(double balance){
        this.balance = balance;
    }
    //constructor requiring we pass in a banlance on instantion 
    //@param banlance the balance the user provided when creating their bank account
    public void deposit(double depositAmount) {
        balance += depositAmount;

    }

    public void withdraw(double withDrawAmount){
        balance -= withDrawAmount; 

    }

    public double GetBalance(){
        return balance;
    }
    

    
        
    


    
    
    


}
