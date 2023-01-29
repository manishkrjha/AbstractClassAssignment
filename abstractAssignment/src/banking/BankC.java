package banking;

public class BankC extends Bank{
    int amountDeposited = 200;

    public void getBalance(){
        System.out.println("The current balance of Bank C is: " + amountDeposited);
    }
}
