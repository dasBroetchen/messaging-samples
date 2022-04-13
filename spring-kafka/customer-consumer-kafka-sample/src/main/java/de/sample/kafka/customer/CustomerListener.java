package de.sample.kafka.customer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerListener {

	private final CustomerService service;

	public CustomerListener(CustomerService service) {
		super();
		this.service = service;
	}

	@KafkaListener(topics = "customers")
	public void listen(Customer customer) {
		this.service.add(customer);
	}

}