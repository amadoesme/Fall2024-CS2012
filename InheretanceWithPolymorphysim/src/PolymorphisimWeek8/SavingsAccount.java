package PolymorphisimWeek8;

public class SavingsAccount extends Account {
	
	//private data variable with the interest rate
    private double interestRate;

    //constructor using account number and interest rate
    public SavingsAccount(int accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    //method adding interest to the account
    public void addInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    //includes the balance, account number and interest rate
    @Override
    public String toString() {
        return super.toString() + ", interest rate = " + interestRate;
    }
}

