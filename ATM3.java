import java.util.Scanner;

public class ATM3 {

    private double balance;

    public ATM3(double balance) {
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

    public static void main(String[] args) {
        ATM3 atm = new ATM3(1000);
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