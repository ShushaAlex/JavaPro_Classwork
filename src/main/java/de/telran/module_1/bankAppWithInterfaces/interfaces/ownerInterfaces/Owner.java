package de.telran.module_1.bankAppWithInterfaces.interfaces.ownerInterfaces;

import de.telran.module_1.bankAppWithInterfaces.interfaces.Cashier;

import java.time.LocalDate;

public interface Owner extends Cashier {
    void closeAccount(LocalDate closingDate);
}





