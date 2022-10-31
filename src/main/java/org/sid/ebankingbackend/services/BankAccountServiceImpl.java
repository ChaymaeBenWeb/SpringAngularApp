package org.sid.ebankingbackend.services;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.sid.ebankingbackend.entities.AccountOperation;
import org.sid.ebankingbackend.entities.BankAccount;
import org.sid.ebankingbackend.entities.CurrentAccount;
import org.sid.ebankingbackend.entities.Customer;
import org.sid.ebankingbackend.entities.SavingAccount;
import org.sid.ebankingbackend.exceptions.CustomerNotFoundException;
import org.sid.ebankingbackend.repositories.BankAccountOperationRepository;
import org.sid.ebankingbackend.repositories.BankAccountRepository;
import org.sid.ebankingbackend.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor @NoArgsConstructor
@Slf4j
public class BankAccountServiceImpl implements BankAccountService{
   
    private CustomerRepository customerRepository;
    private BankAccountRepository bankAccountRepository;
    private BankAccountOperationRepository bankAccountOperationRepository;
    



    @Override
    public Customer saveCustomer(Customer customer) {
        log.info("Saving Customer");
        Customer savedCustomer = customerRepository.save(customer);
        return savedCustomer;
    }

    @Override
    public BankAccount saveBankAccount(double initialBalance, String type, Long CustomerId) throws CustomerNotFoundException {
        Customer customer = customerRepository.findById(CustomerId).orElse(null);
        if(customer==null)
        throw new CustomerNotFoundException("Customer ,ot found");
        BankAccount bankAccount;
        if(type.equals("current")){
            bankAccount=new CurrentAccount();
        } else{
            bankAccount = new SavingAccount();
        }
        bankAccount.setId(UUID.randomUUID().toString());
        bankAccount.setCreatedAt(new Date());
        bankAccount.setBalance(initialBalance);
        bankAccount.getCustomer();
        return null;
    }

    @Override
    public List<Customer> listCustomer() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BankAccount getBankAccount(String accountId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void debit(String accountId, double amount, String description) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void credit(String accountId, double amount, String description) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void transfer(String accountIdSource, String accountIdDestination, double amount) {
        // TODO Auto-generated method stub
        
    }

    
}
