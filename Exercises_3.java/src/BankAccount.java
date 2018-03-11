public class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {

        if (amount <= 0) {
            String msg = "Amount must be positive.";
            throw new IllegalArgumentException(msg);
        }
        if (amount >= balance) {
            int deficit = amount - balance;
            throw new InsufficientFundsException(deficit);
        }

        balance = balance - amount;
    }

}
