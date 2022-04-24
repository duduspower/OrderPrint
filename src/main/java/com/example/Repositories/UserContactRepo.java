package com.example.Repositories;

import com.example.UserContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserContactRepo extends JpaRepository<UserContact,Integer> {
}
