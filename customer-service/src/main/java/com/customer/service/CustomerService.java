package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.entity.Customer;
import com.customer.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	public Customer getCustomerById(Long id) {
		return customerRepository.findById(id).orElse(null);
	}

	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);
	}
}
