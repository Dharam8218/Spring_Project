package com.bytecode.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytecode.spring.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
