package com.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	public Customer findById(int id);

}
