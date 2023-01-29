package banking;

public class BankB extends Bank{
    int amountDeposited = 150;

    public void getBalance(){
        System.out.println("The current balance of Bank B is: " + amountDeposited);
    }
}
