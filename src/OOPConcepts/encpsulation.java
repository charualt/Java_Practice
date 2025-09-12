package OOPConcepts;

class BankAccount{
    private double bankSavings;

    public BankAccount(double bankSavings){
        this.bankSavings= bankSavings;
    }

    public double getBankSavings(){
        return bankSavings;
    }

    public void deposit(double amount){
        if(amount > 0) bankSavings -=amount;
    }

    public void withdraw(double amount){
        if(amount <= bankSavings) bankSavings += amount;
    }
}

public class encpsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(200);
        acc.deposit(100);
        acc.withdraw(50);
        System.out.println("Balance"+ acc.getBankSavings());
    }
}
