package org.sid.ebankingbackend.services;

import java.util.List;

import org.sid.ebankingbackend.entities.BankAccount;
import org.sid.ebankingbackend.entities.Customer;
import org.sid.ebankingbackend.exceptions.CustomerNotFoundException;

public interface BankAccountService {

    Customer saveCustomer(Customer customer);
    BankAccount saveBankAccount(double initialBalance, String type, Long CustomerId) throws CustomerNotFoundException;
    List<Customer> listCustomer();
    BankAccount getBankAccount(String accountId);

    void debit(String accountId, double amount, String description);
    void credit(String accountId, double amount, String description);
    void transfer(String accountIdSource, String accountIdDestination, double amount);
    

}
