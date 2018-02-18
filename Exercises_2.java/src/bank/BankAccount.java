package bank;

public class BankAccount {

    final static double MIN_BORROWING_RATE = 0.06;
    final static double MAX_SAVING_RATE = 0.02;
    final static int MAX_BALANCE = 250000;
    final static int MIN_BALANCE = -100000;

    private int balance;
    private double borrowingRate;
    private double savingsRate;
    private double interest;

    public BankAccount(int balance, double borrowingRate, double savingsRate) {
        assert borrowingRate >= MIN_BORROWING_RATE : "Borrowing rate too low.";
        assert savingsRate <= MAX_SAVING_RATE : "Saving rate too high.";
        assert balance <= MAX_BALANCE && balance >= MIN_BALANCE : "Balance isn't valid.";

        this.balance = balance;
        this.borrowingRate = borrowingRate;
        this.savingsRate = savingsRate;
    }

    public boolean setBorrowingRate(double borrowingRate) {
        if(borrowingRate >= MIN_BORROWING_RATE){
            this.borrowingRate = borrowingRate;
            return true;
        }
        return false;
    }

    public boolean setSavingsRate(double savingsRate) {
        if(savingsRate <= MAX_SAVING_RATE){
            this.savingsRate = savingsRate;
            return true;
        }
        return false;
    }

    public boolean deposit(double amount){
        if(this.balance + amount <= MAX_BALANCE){
            if(amount > 0){
                this.balance += amount;
                return true;
            }
        }
        return false;
    }

    public boolean withdraw(double amount){
        if(this.balance - amount >= MIN_BALANCE)
        {
            if(amount > 0){
                this.balance -= amount;
                return true;
            }
        }
        return false;
    }

    public void 

}
