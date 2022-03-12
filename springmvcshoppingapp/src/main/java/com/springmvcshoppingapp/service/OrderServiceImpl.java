package com.springmvcshoppingapp.service;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvcshoppingapp.dao.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Override
	public Order addOrder(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public boolean deleteOrderById(Long orderId) {
		orderRepository.deleteById(orderId);
		if (orderRepository.existsById(orderId)) {
			return false;
		}
		return false;
	}

	@Override
	public List<Order> getAllOrder() {
		return (List<Order>) orderRepository.findAll();
	}
}
