package com.example.Repositories;

import com.example.PersonalData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonalDataRepo extends JpaRepository<PersonalData,Integer> {
}
