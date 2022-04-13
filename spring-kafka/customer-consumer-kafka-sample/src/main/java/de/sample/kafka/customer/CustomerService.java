package de.sample.kafka.customer;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	private final List<Customer> customers = new LinkedList<>();

	public List<Customer> getCustomers() {
		return customers;
	}

	public void add(Customer customer) {
		System.out.println("Add customer " + customer);
		this.customers.add(customer);
	}

}