package com.springmvcshoppingapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvcshoppingapp.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	OrderService orderService;

	@GetMapping("/order")
	public ModelAndView getOrderForm(@ModelAttribute Order order) {
		ModelAndView modelAndView = new ModelAndView("orderform");
		return modelAndView;
	}
			@PostMapping("/saveorder")
			public ModelAndView addOrder(Order order) {
				Order ord = orderService.addOrder(order);
				ModelAndView modelAndView;
				// Model in Spring Web MVC is a map
				Map messageModel = new HashMap();
				if (ord != null) {
					messageModel.put("ordData", ord);
					modelAndView = new ModelAndView("successdata", messageModel);
				} else {
					messageModel.put("errormsg", "Unable to add Order");
					modelAndView = new ModelAndView("errorMsg", messageModel);
				}
				return modelAndView;
			}
			

//Retrieve
	@GetMapping("/retrieveorders")
	public ModelAndView getAllOrder() {
		List<Order> listOfOrder = orderService.getAllOrder();
		Map orderModel = new HashMap();
		/**
		 * Model model = null; model.addAttribute("listOfEmployee", listOfEmployee);
		 * return new ModelAndView("allemployee",model.asMap());
		 **/
		if (!listOfOrder.isEmpty()) {
			orderModel.put("listOfOrder", listOfOrder);
			return new ModelAndView("allorder", orderModel, HttpStatus.OK);
		} else {
			orderModel.put("message", "No orders found");
			return new ModelAndView("nodatafound", orderModel, HttpStatus.NOT_FOUND);
		}

	}


			@GetMapping("/deleteOrderById/{orderId}")
			public ModelAndView deleteOrderById(@PathVariable Long orderId) {
				Map model = new HashMap();
				if (orderService.deleteOrderById(orderId)) {
					model.put("deletemsg", "Order deleted susccessfully");
					return new ModelAndView("successdelete", model);
				} else {
					model.put("message", "No order found");
					return new ModelAndView("nodatafound", model);
				}

			}

}