package org.sid.ebankingbackend.repositories;

import org.sid.ebankingbackend.entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountOperationRepository extends JpaRepository<AccountOperation,Long> {
    
}
