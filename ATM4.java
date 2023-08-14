import java.util.Scanner;

public class ATM4 {
    private double accountBalance;

    public ATM4(double initialBalance) {
        accountBalance = initialBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        ATM4 account = new ATM4(initialBalance);

        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        double balance = account.getAccountBalance();
        System.out.println("Current Account Balance: " + balance);

        scanner.close();
    }
}
