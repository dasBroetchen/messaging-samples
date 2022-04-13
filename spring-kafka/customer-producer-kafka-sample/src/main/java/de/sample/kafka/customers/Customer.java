package de.sample.kafka.customers;

import java.time.LocalDate;

public class Customer {

	private String name;
	private LocalDate birthdate;

	public Customer(String name, LocalDate birthdate) {
		super();
		this.name = name;
		this.birthdate = birthdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

}
