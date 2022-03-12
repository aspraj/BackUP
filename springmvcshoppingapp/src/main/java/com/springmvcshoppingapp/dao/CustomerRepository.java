package com.springmvcshoppingapp.dao;


import org.springframework.data.repository.CrudRepository;

import com.springmvcshoppingapp.model.Customer;


public interface CustomerRepository extends CrudRepository<Customer,Long> {
}