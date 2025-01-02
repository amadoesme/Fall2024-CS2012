//Name: Esmeralda Amado
//Course: CS 2012, 1 & 4
//Comments: I got some help from my friends in ASME
//they guide me through the code and made sure I
//fully understood polymorphism, especially with the bank class

package PolymorphisimWeek8;

import java.util.ArrayList;

public class Bank {
	
	//array list to contain different type of accounts (account, savings account, current account)
    private ArrayList<Account> accounts;

    //constructor
    public Bank() {
        accounts = new ArrayList<>();
    }

    //method to open a new account
    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Account opened: " + account);
    }
 
    //method to close an account
    public void closeAccount(int accountNumber) {
        accounts.removeIf(account -> account.getAccountNumber() == accountNumber);
        System.out.println("Account " + accountNumber + " closed.");
    }

    //method to update accounts
    public void updateAccounts() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            } else if (account instanceof CurrentAccount) {
                CurrentAccount current = (CurrentAccount) account;
                if (current.isInOverdraft()) {
                    System.out.println("Sending overdraft letter to account: " + current.getAccountNumber());
                }
            }
        }
    }

    //method to pay a dividend to all accounts
    public void payDividend(double amount) {
        for (Account account : accounts) {
            account.deposit(amount);
        }
        System.out.println("Dividend of " + amount + " paid to all accounts.");
    }

    //method to print all accounts
    public void printAllAccounts() {
        for (Account account : accounts) {
            account.print();
        }
    }
}

