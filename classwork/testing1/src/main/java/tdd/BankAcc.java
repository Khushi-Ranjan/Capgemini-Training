package tdd;

public class BankAcc {
    private int balance;
    public BankAcc(int balance){
        this.balance = balance;
    }
    public void deposit(int amount){
        balance+=amount;
        System.out.println(balance);
    }

    public void withdraw(int amount){
        if (amount<=0){
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if (amount > balance){
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }
    public int getBalance(){
        return balance;
    }
}
