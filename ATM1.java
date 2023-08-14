import java.util.Scanner;

public class ATM1 {
    private double availableBalance;

    public ATM1(double initialBalance) {
        availableBalance = initialBalance;
    }

    public void deposit(double amount) {
        availableBalance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= availableBalance) {
            availableBalance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        Atm2 atm = new Atm2(initialBalance);

        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        atm.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        atm.withdraw(withdrawalAmount);

        System.out.println("Available Balance: " + atm.getBalance());

        scanner.close();
    }

	public String getBalance() {
		return null;
	}
}
