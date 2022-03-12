package com.springmvcshoppingapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvcshoppingapp.model.Customer;
import com.springmvcshoppingapp.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	CustomerService customerService;

		@GetMapping("/customer")
		public ModelAndView getCustomerForm(@ModelAttribute Customer customer) {
			ModelAndView modelAndView = new ModelAndView("customerform");
			return modelAndView;
		}

		// Create
		@PostMapping("/savecustomer")
		public ModelAndView addCustomer(Customer customer) {
			Customer cust = customerService.addCustomer(customer);
			ModelAndView modelAndView;
			// Model in Spring Web MVC is a map
			Map messageModel = new HashMap();
			if (cust != null) {
				messageModel.put("custData", cust);
				modelAndView = new ModelAndView("successwithdata", messageModel);
			} else {
				messageModel.put("errormsg", "Unable to add customer");
				modelAndView = new ModelAndView("errorMsg", messageModel);
			}
			return modelAndView;
		}
		
		@GetMapping("/deleteCustomerById/{customerId}")
		public ModelAndView deleteCustomerById(@PathVariable Long customerId) {
			Map model = new HashMap();
			if (customerService.deleteCustomerById(customerId)) {
				model.put("deletemsg", "Customer deleted susccessfully");
				return new ModelAndView("successdelete", model);
			} else {
				model.put("message", "No customer found");
				return new ModelAndView("nodatafound", model);
			}

		}
}