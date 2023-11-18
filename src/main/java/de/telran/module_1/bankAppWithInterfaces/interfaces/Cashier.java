package de.telran.module_1.bankAppWithInterfaces.interfaces;

public interface Cashier {
    void deposit(double sum);
    void withdraw(double sum);
    double getBalance();
}
