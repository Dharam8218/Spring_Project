package com.bytecode.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bytecode.spring.entity.Customer;

@Service
public interface CustomerService {
    
	public Customer add(Customer customer);
	public List<Customer> getCustomers();
	public void deleteCustomer();
	public Customer updateCustomer(Customer customer);
	//public Customer delete(Customer customer);
}
