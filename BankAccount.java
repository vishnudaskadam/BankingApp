public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        // Perform validation, logging, etc.
        balance += amount;
    }

    public void withdraw(double amount) {
        // Perform validation, logging, etc.
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount();

        // Deposit $1000
        account.deposit(1000);
        System.out.println("Balance after deposit: $" + account.getBalance());

        // Withdraw $500
        account.withdraw(500);
        System.out.println("Balance after withdrawal: $" + account.getBalance());

        // Withdraw $700 (more than the balance)
        account.withdraw(700);
        System.out.println("Balance after attempted withdrawal: $" + account.getBalance());
    }
}