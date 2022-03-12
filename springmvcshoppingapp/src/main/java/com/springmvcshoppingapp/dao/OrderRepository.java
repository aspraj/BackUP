package com.springmvcshoppingapp.dao;


import javax.persistence.criteria.Order;

import org.springframework.data.repository.CrudRepository;

import com.springmvcshoppingapp.model.Customer;

public interface OrderRepository extends CrudRepository<Order, Long> {


}