//package com.springmvcshoppingapp.controller;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.springmvcshoppingapp.model.Product;
//import com.springmvcshoppingapp.service.ProductService;
//
//@Controller
//public class ProductController {
//
//	@Autowired
//	ProductService productService;
//
//	@GetMapping("/product")
//	public ModelAndView getproductForm(@ModelAttribute Product product) {
//		ModelAndView modelAndView = new ModelAndView("productform");
//		return modelAndView;
//	}
//
//	@PostMapping("/saveproduct")
//	public ModelAndView addProduct(Product product) {
//		Product prod = productService.addProduct(product);
//		ModelAndView modelAndView;
//		// Model in Spring Web MVC is a map
//		Map messageModel = new HashMap();
//		if (prod != null) {
//			messageModel.put("prodData", prod);
//			modelAndView = new ModelAndView("successwithdata", messageModel);
//		} else {
//			messageModel.put("errormsg", "Unable to add product");
//			modelAndView = new ModelAndView("errorMsg", messageModel);
//		}
//		return modelAndView;
//	}
//	
//	
//	@GetMapping("/deleteProductById/{productId}")
//	public ModelAndView deleteOrderById(@PathVariable Long productId) {
//		Map model = new HashMap();
//		if (productService.deleteProductById(productId)) {
//			model.put("deletemsg", "Product deleted susccessfully");
//			return new ModelAndView("successdelete", model);
//		} else {
//			model.put("message", "No product found");
//			return new ModelAndView("nodatafound", model);
//		}
//
//	}
//}
//
