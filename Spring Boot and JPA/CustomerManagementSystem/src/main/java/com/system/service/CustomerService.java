package com.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.system.entity.Customer;
import com.system.repository.CustomerRepository;

@Component
public class CustomerService {
	

		@Autowired
		private CustomerRepository customerrepo;
		// to get all the books
		public List<Customer> getAllCustomers()
		{
			List<Customer> list=(List<Customer>)this.customerrepo.findAll();
			return list;
		}
		
		//to get customers by ID
		public Customer getById(int id)
		{
			Customer customer=null;
			try {
				customer=this.customerrepo.findById(id);
				return customer;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return customer;
			}
		}
		

		//to add a new customer to the list
		public Customer addCustomer(Customer cus)
		{
			Customer result=this.customerrepo.save(cus);
			return result;
		}

		//delete a customer from the list based on ID
		public void deleteCustomer(int id) 
		{
			this.customerrepo.deleteById(id);
			
		}

		public void updateCustomer(Customer customer, int customerId) {
			//book.setBid(bookId);
			this.customerrepo.save(customer);
			
		}
	}



