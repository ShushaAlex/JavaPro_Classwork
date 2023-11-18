package de.telran.module_1.bankAppWithInterfaces;

import de.telran.module_1.bankAppWithInterfaces.entities.CardAccount;
import de.telran.module_1.bankAppWithInterfaces.entities.CreditAccount;
import de.telran.module_1.bankAppWithInterfaces.entities.DepositAccount;
import de.telran.module_1.bankAppWithInterfaces.interfaces.adminInterfaces.AdminCard;
import de.telran.module_1.bankAppWithInterfaces.interfaces.adminInterfaces.AdminCredit;
import de.telran.module_1.bankAppWithInterfaces.interfaces.adminInterfaces.AdminDeposit;
import de.telran.module_1.bankAppWithInterfaces.interfaces.ownerInterfaces.OwnerCard;
import de.telran.module_1.bankAppWithInterfaces.interfaces.ownerInterfaces.OwnerCredit;
import de.telran.module_1.bankAppWithInterfaces.interfaces.ownerInterfaces.OwnerDeposit;
import de.telran.module_1.bankAppWithInterfaces.interfaces.Cashier;

import java.time.LocalDate;

public class BankDemo {
    public static void main(String[] args) {
        DepositAccount depositAccount = new DepositAccount(1000, "Ivan", "1234567890123456", LocalDate.of(2023,10,12));
        CreditAccount creditAccount = new CreditAccount("Ivan", "1234567890123456", 1000, 2000, LocalDate.of(2023,10,12));
        CardAccount cardAccount = new CardAccount(1000, "Ivan", "1234567890123456", LocalDate.of(2023,10,12));

        Cashier cashier = creditAccount;
        OwnerDeposit ivanDeposit = depositAccount;
        OwnerCredit ivanCredit = creditAccount;
        OwnerCard ivanCard = cardAccount;
        AdminDeposit adminDeposit = depositAccount;
        AdminCredit adminCredit = creditAccount;
        AdminCard adminCard = cardAccount;

        cardAccount.setOverdraft(200);
        ivanCard.withdraw(200);
        System.out.println(ivanCard.getBalance());
    }
}
