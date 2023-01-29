package banking;

public class BankA extends Bank {
    int amountDeposited = 100;

    public void getBalance(){
        System.out.println("The current balance of Bank A is: " + amountDeposited);
    }
}
