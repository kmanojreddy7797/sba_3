package com.sba3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sba3.dao.CustomerDAO;
import com.sba3.model.Customer;

@Service
public class CustomerServiceImplementation implements CustomerService {

	@Autowired
	private CustomerDAO custdao;

	@Override
	public Customer addCustomer(Customer customer) {
		return custdao.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return custdao.findAll();
	}

}
