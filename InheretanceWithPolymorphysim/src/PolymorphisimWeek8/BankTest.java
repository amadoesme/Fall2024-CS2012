package PolymorphisimWeek8;

//checking to see if my code works 
public class BankTest {

	public static void main(String[] args) {
        Bank bank = new Bank();
        
        SavingsAccount savings = new SavingsAccount(3045, 0.11);
        CurrentAccount current = new CurrentAccount(2012, 267);
        
        bank.openAccount(savings);
        bank.openAccount(current);
        
        savings.deposit(9000);
        current.deposit(1000);
        
        bank.updateAccounts();
        bank.printAllAccounts();
        
        bank.payDividend(500);
        bank.printAllAccounts();
        
        bank.closeAccount(2013);
        bank.printAllAccounts();
    }
}
