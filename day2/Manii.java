class ATM {
    private double balance = 1000;   // hidden data

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        ATM a = new ATM();

        a.checkBalance();
        a.deposit(500);
        a.withdraw(300);
        a.checkBalance();
    }
}