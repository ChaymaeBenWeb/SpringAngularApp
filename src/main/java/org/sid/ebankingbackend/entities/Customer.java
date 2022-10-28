package org.sid.ebankingbackend.entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Customer {

    private Long id;
    private String name;
    private String email;
    private List<BankAccount> bankAccount;

    
}