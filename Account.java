public class Account {
    private double balance;

    // no argument constructor
    public Account() {
        this.balance = 0.0;
    }

    // Two-argument constructor
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Withdrawal amount must be positive and less than or equal to the balance.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args) {
        Account account1 = new Account(); 
        account1.deposit(100);
        account1.withdraw(50);
        account1.displayBalance();

        Account account2 = new Account(200); 
        account2.deposit(150);
        account2.withdraw(100);
        account2.displayBalance();
    }
}


