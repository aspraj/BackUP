package com.springmvcshoppingapp.service;

import java.util.List;

import javax.persistence.criteria.Order;

public interface OrderService {

	public Order addOrder(Order order);

	public boolean deleteOrderById(Long orderId);
	
	public List<Order> getAllOrder();


}
