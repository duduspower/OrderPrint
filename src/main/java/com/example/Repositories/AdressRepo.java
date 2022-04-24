package com.example.Repositories;

import com.example.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AdressRepo extends JpaRepository<Adress,Integer> {
}
