package de.sample.kafka.customer;

import java.time.LocalDate;

public class Customer {

    private String name;
    private LocalDate birthdate;
    
	public Customer(String name, LocalDate birthdate) {
		super();
		this.name = name;
		this.birthdate = birthdate;
	}

    
    
}
