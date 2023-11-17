package de.telran.module_1.lesson_2.interfaces;

public interface AdminCredit extends Admin {
    void setCreditLimit(double sum);
    void setMaxWithdraw(double sum);
}
