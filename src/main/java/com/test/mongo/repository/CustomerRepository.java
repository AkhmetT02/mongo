package com.test.mongo.repository;

import com.test.mongo.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    List<Customer> findByEmail(String email);
}