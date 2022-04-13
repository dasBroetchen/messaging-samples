package de.sample.kafka.customer;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/customers")
@RestController
public class CustomerController {

	private final CustomerService service;

	public CustomerController(CustomerService service) {
		super();
		this.service = service;
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getCustomers() {
		return service.getCustomers();
	}

}
