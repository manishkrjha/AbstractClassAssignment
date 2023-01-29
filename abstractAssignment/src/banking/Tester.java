package banking;

public class Tester {
    public static void main(String[] args){
        BankA b1 = new BankA();
        b1.getBalance();

        BankB b2 = new BankB();
        b2.getBalance();

        BankC b3 = new BankC();
        b3.getBalance();
    }
}
