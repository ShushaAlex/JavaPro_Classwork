package de.telran.module_1.lesson_2.entities;

public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected String status;
    protected String openDate;
    protected String closeDate;

    public double getBalance() {
        return balance;
    }

    public abstract void withdraw(double sum);

    public abstract void deposit(double sum);

    public void setStatus(String status) {
        if (status.equals("opened") || status.equals("closed") || status.equals("frozen")){
            this.status = status;
        } else {
            System.out.println("Incorrect status, try again.");
        }
    }

    public void closeAccount(String closeDate) {
        if (balance != 0) {
            this.status = "closed";
            this.closeDate = closeDate;
            System.out.println("Your account is closed");
        } else {
            System.out.println("You can't close your account");
        }
    }
}
