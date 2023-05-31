package com.system.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.system.entity.Customer;
import com.system.service.CustomerService;

@RestController
public class CustomerController {
	
	
		@Autowired
		private CustomerService customerservice;
		
		@GetMapping("/customers")
		public ResponseEntity<List<Customer>> getCustomers()
		{
			List<Customer> list=customerservice.getAllCustomers();
			if(list.size()<=0)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			return ResponseEntity.of(Optional.of(list));
		}
		
		@GetMapping("/customers/{id}")
		public ResponseEntity<Customer> getCustomer(@PathVariable("id") int id)
		{
			Customer customer=customerservice.getById(id);
			if(customer==null)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			return ResponseEntity.of(Optional.of(customer));
		}
		
		@PostMapping("/customers")
		public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)
		{
			Customer cu=null;
			try {
					cu=this.customerservice.addCustomer(customer);
					System.out.println(cu);
					return ResponseEntity.of(Optional.of(cu));
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			
		}
		
		@DeleteMapping("/customers/{customerid}")
		public ResponseEntity<Void> deleteCustomer(@PathVariable("customerid") int id)
		{
			try {
					this.customerservice.deleteCustomer(id);
					return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			
		}
		@PutMapping("/customers/{customerid}")
		public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer, @PathVariable ("customerid") int customerId)
		{
			try {
				this.customerservice.updateCustomer(customer, customerId);
				return ResponseEntity.status(HttpStatus.OK).body(customer);
			}
			catch(Exception e)
			{
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
		}
	}



