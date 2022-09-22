package com.quickpay.springbootrest.service;

import java.util.List;

import com.quickpay.springbootrest.model.Product;

public interface IProductService {
	List<Product> findAll();
}