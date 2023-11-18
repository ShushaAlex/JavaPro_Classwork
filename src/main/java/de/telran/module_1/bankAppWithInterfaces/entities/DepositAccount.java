package de.telran.module_1.bankAppWithInterfaces.entities;

import de.telran.module_1.bankAppWithInterfaces.interfaces.adminInterfaces.AdminDeposit;
import de.telran.module_1.bankAppWithInterfaces.interfaces.ownerInterfaces.OwnerDeposit;

import java.time.LocalDate;

public class DepositAccount extends ClientAccount implements AdminDeposit, OwnerDeposit {
    private double maxDeposit;

    public DepositAccount(double maxDeposit, String accountOwner, String accountNumber, LocalDate openingDate) {
        this.maxDeposit = maxDeposit;
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        this.status = "opened";
        this.openDate = openingDate;
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
        if (sum <= balance && (balance - sum) >= 0) {
            balance = balance - sum;
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

    @Override
    public String getStatus() {
        return this.status;
    }
}
