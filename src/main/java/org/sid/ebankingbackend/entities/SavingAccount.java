package org.sid.ebankingbackend.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data

//@DiscriminatorValue("SA")
@NoArgsConstructor @AllArgsConstructor
public class SavingAccount extends BankAccount{

    private double intrestRate;
    
}
