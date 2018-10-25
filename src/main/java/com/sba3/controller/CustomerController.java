package com.sba3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sba3.model.Customer;
import com.sba3.service.CustomerService;

@RestController
@RequestMapping(value="/")
public class CustomerController {

	@Autowired
	private CustomerService custService;
	
	@GetMapping("/listcustomers")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		
		ResponseEntity<List<Customer>> resp = null;
		
		List<Customer> customers = custService.getAllCustomers();
		
		if(customers!=null)
			resp = new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
		else
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		
		return resp;
	}
	
	@PostMapping("/add")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer employee){
		
		ResponseEntity<Customer> resp = null;
		
		resp = new ResponseEntity<>(custService.addCustomer(employee), HttpStatus.OK);
		
		return resp;
		
	}
	
}
