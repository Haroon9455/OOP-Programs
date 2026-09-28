class BankAccount {
    private double balance;

    public BankAccount() { balance = 0; }

    public void deposit(double amt) {
        if (amt > 0) balance += amt;
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient balance");
    }

    public double getBalance() { return balance; }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit(5000);
        b.withdraw(1500);
        System.out.println("Balance: " + b.getBalance());
    }
}
