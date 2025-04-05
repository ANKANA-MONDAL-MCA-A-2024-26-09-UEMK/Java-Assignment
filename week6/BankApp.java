package week6;

abstract class Accounts {
    double balance;
    String accountNumber;
    String accountHoldersName;
    String address;

    abstract void withdrawal(double amount);
    abstract void deposit(double amount);

    void display() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest = 4.5;

    public SavingsAccount(String accNo, String holder, String addr, double bal) {
        accountNumber = accNo;
        accountHoldersName = holder;
        address = addr;
        balance = bal;
    }

    void withdrawal(double amount) {
        balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void calculateAmount() {
        double interest = balance * rateOfInterest / 100;
        System.out.println("Interest Amount: " + interest);
    }
}

public class BankApp {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("12345", "Ankana", "Kolkata", 10000);
        sa.deposit(500);
        sa.withdrawal(200);
        sa.display();
        sa.calculateAmount();
    }
}
