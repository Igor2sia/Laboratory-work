package oop;
public class BankAccount {
    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static double interesetRate = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount = 1;
    private int id;
    private double balance;

    public static void setInteresetRate(double interesetRate) {
        BankAccount.interesetRate = interesetRate;
    }
    void deposit(double amount){
        this.balance += amount;
    }
    double getInterest(int years){
        return BankAccount.interesetRate * years * this.balance;
    }
    public BankAccount(){
        this.id = bankAccountCount++;
    }
}
