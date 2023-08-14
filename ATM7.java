import java.util.Scanner;

public class ATM7 {

    private BankAccount account;

    public ATM7(BankAccount account) {
        this.account = account;
    }

    public void withdraw(double amount) {
        if (amount > account.getBalance()) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        account.withdraw(amount);
        System.out.println("Your transaction was successful.");
    }

    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Your transaction was successful.");
    }

    public double getBalance() {
        return account.getBalance();
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        ATM7 atm = new ATM7(account);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM");
        System.out.println("What would you like to do?");
        System.out.println("1. Withdraw money");
        System.out.println("2. Deposit money");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");

        int choice = scanner.nextInt();

        while (choice != 4) {
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount you want to withdraw:");
                    double amount = scanner.nextDouble();
                    atm.withdraw(amount);
                    break;
                case 2:
                    System.out.println("Enter the amount you want to deposit:");
                    amount = scanner.nextDouble();
                    atm.deposit(amount);
                    break;
                case 3:
                    System.out.println("Your balance is: " + atm.getBalance());
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("What else would you like to do?");
            System.out.println("1. Withdraw money");
            System.out.println("2. Deposit money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");

            choice = scanner.nextInt();
        }

        System.out.println("Thank you for using the ATM");

        scanner.close();
    }
}

class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
