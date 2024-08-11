package com.bytecode.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytecode.spring.dao.CustomerRepository;
import com.bytecode.spring.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer add(Customer customer) {
		return customerRepository.save(customer);
		
	}

	@Override
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
		
	}

	@Override
	public void deleteCustomer() {
		customerRepository.deleteAll();
		
		
		
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Customer existingCustomer=customerRepository.findById(customer.getCustomerId()).orElse(null);
		existingCustomer.setCustomerName(customer.getCustomerName());
		existingCustomer.setCustomerAddress(customer.getCustomerAddress());
		existingCustomer.setCustomerMobileNumber(customer.getCustomerMobileNumber());
		existingCustomer.setCustomerPrice(customer.getCustomerPrice());
		return customerRepository.save(existingCustomer);
	}

}
