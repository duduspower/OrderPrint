package com.example.Repositories;

import com.example.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepo extends JpaRepository<Order,Integer> {
}
