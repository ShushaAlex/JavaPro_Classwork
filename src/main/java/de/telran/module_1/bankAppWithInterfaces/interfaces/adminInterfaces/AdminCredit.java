package de.telran.module_1.bankAppWithInterfaces.interfaces.adminInterfaces;

public interface AdminCredit extends Admin {
    void setCreditLimit(double sum);
    void setMaxWithdraw(double sum);
}
