package de.telran.module_1.lesson_2.entities;

public class DepositAccount extends ClientAccount {
    private double maxDeposit;

    public DepositAccount(double maxDeposit, String accountOwner, String accountNumber) {
        this.maxDeposit = maxDeposit;
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        this.status = "opened";
        this.openDate = "today";
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public double getMaxDeposit() {
        return maxDeposit;
    }

    public void setMaxDeposit(double maxDeposit) {
        this.maxDeposit = maxDeposit;
    }

    @Override
    public void withdraw(double sum) {
        if (sum <= balance) {
            balance -= sum;
            System.out.println("Your balance has been changed");
        } else {
            System.out.println("You try to withdraw more as you have");
        }
    }
    @Override
    public void deposit(double sum) {
        if (sum <= maxDeposit) {
            balance += sum;
            System.out.println("Your balance has been changed");
        } else {
            System.out.println("You try to deposit more as allowed");
        }
    }
}
