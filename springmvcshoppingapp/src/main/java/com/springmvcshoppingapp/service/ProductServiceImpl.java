//package com.springmvcshoppingapp.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.springmvcshoppingapp.dao.ProductRepository;
//import com.springmvcshoppingapp.model.Product;
//
//@Service
//public class ProductServiceImpl implements ProductService {
//
//	@Autowired
//	ProductRepository productRepository;
//
//	@Override
//	public Product addProduct(Product product) {
//		return productRepository.save(product);
//	}
//
//	@Override
//	public boolean deleteProductById(Long productId) {
//		productRepository.deleteById(productId);
//		if (productRepository.existsById(productId)) {
//			return false;
//		}
//		return false;
//	}
//}
