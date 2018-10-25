package com.sba3.service;

import java.util.List;

import com.sba3.model.Customer;

public interface CustomerService {
	Customer addCustomer(Customer customer);
	List<Customer> getAllCustomers();
}
