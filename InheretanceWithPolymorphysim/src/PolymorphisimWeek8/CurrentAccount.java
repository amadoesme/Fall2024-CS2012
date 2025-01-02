package PolymorphisimWeek8;

public class CurrentAccount extends Account {
	
	//private data variable with overdraft limit
    private double overdraftLimit;

    //constructor to initialize a current account with an overdraft limit
    public CurrentAccount(int accountNumber, double overdraftLimit) {
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    //method to allow withdrawals up to the overdraft limit
    @Override
    public void withdraw(double sum) {
        if (sum > 0) { //checks if the withdrawal amount is positive
            if (getBalance() - sum >= -overdraftLimit) {
                super.withdraw(sum);
            } else {
                System.out.println("Can't do withdrawal");
            }
        } else {
            System.err.println("CurrentAccount.withdraw(...): cannot withdraw negative amount");
        }
    }

    //checks if the account is currently in overdraft
    public boolean isInOverdraft() {
        return getBalance() < 0;
    }

    //method to include overdraft limit information
    @Override
    public String toString() {
        return super.toString() + ", overdraft limit = " + overdraftLimit;
    }
}

