package com.bytecode.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytecode.spring.entity.Customer;
import com.bytecode.spring.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.add(customer);
		
	}
	
	@GetMapping("/get")
	public List<Customer> fetchAllcustomer(){
		return customerService.getCustomers();
	}
	
	@DeleteMapping("/delete")
	public void delete() {
		customerService.deleteCustomer();
		
		
	}
	
	@PutMapping("/update")
	public Customer update(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}
	
	@PostMapping("/test")
	public String test() {
		return "testing";
	}
}
