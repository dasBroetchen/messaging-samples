package de.sample.messaging.spring;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class CustomersJMSConsumer {

	private final CustomersService service;

	public CustomersJMSConsumer(CustomersService service) {
		super();
		this.service = service;
	}

	@JmsListener(destination = "${messaging.queue}")
	public void onMessage(Message<Customer> message) {
		System.out.println(message.getPayload());
		this.service.addCustomer(message.getPayload());
	}
}
