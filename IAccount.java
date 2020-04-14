
/*
Christina Nguyen
CSC 331 - 001
Lab 8 : Intro to Java Generics
 */

public interface IAccount {
    public abstract boolean deposit(double amount);
    public boolean withdraw(double amount);
    public int getAccountNumber();
    public void setAccountNumber(int accountNumber);
    public double getBalance();
    public void setBalance(double balance);
}