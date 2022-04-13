package de.sample.messaging.spring;

import java.util.Collection;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers")
public class CustomersController {

	private final CustomersService service;

	public CustomersController(CustomersService service) {
		super();
		this.service = service;
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Customer> getCustomers() {
		return this.service.getCustomers();
	}

	@GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer getCustomer(@PathVariable("id") long id) {
		return this.service.findById(id).orElseThrow(NotFoundException::new);
	}

}
