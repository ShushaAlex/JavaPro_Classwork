package de.telran.module_1.bankAppWithInterfaces.entities;

import de.telran.module_1.bankAppWithInterfaces.interfaces.adminInterfaces.AdminCard;
import de.telran.module_1.bankAppWithInterfaces.interfaces.ownerInterfaces.OwnerCard;

import java.time.LocalDate;

public class CardAccount extends ClientAccount implements AdminCard, OwnerCard {

    private double overdraft;

    public CardAccount(double overdraft, String accountOwner, String accountNumber, LocalDate openingDate) {
        this.overdraft = overdraft;
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        this.status = "opened";
        this.openDate = openingDate;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double sum) {
        if ((balance - sum) >= -overdraft) {
            balance -= sum;
            System.out.println("You have successfully withdrawn money from your account!");
        } else {
            System.out.println("Operation declined");
        }
    }

    @Override
    public void deposit(double sum) {
        balance += sum;
    }

    @Override
    public void closeAccount(LocalDate closingDate) {

    }

    @Override
    public String getStatus() {
        return this.status;
    }
}