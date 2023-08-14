import java.util.Scanner;

public class ATM6 {
    private double accountBalance;

    public ATM6(double initialBalance) {
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
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        } else if (amount > accountBalance) {
            System.out.println("Insufficient funds");
        } else {
            accountBalance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        ATM6 bankAccount = new ATM6(initialBalance);

        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    bankAccount.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Available Balance: " + bankAccount.getAccountBalance());
                    break;
                case 0:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
