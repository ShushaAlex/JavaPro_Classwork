package de.telran.module_1.bankAppWithInterfaces.entities;
import de.telran.module_1.bankAppWithInterfaces.interfaces.ownerInterfaces.Owner;
import de.telran.module_1.bankAppWithInterfaces.interfaces.Cashier;

import java.time.LocalDate;

public abstract class Account implements Cashier, Owner {
    protected String accountNumber;
    protected double balance;
    protected String status;
    protected LocalDate openDate;
    protected LocalDate closeDate;

    public double getBalance() {
        return balance;
    }

    public void setStatus(String status) {
        if (status.equals("opened") || status.equals("closed") || status.equals("frozen")){
            this.status = status;
        } else {
            System.out.println("Incorrect status, try again.");
        }
    }

    public void closeAccount(LocalDate closeDate) {
        if (balance == 0) {
            this.status = "closed";
            this.closeDate = closeDate;
            System.out.println("Your account is closed");
        } else {
            System.out.println("You can't close your account");
        }
    }
}
