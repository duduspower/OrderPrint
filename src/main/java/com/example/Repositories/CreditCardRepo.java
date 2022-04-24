package com.example.Repositories;

import com.example.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CreditCardRepo extends JpaRepository<CreditCard,Integer> {
}
