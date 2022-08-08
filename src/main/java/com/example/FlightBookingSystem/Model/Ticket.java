package com.example.FlightBookingSystem.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ticket {

	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Flight flight;
	
	@ManyToOne
	private Passenger passenger;
	
	public Ticket() {
		super();
	}
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Ticket(Passenger passenger) {
		super();
		this.passenger = passenger;
	}
	
	public Flight getFlight() {
		return flight;
	}
	
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	public Passenger getPassenger() {
		return passenger;
	}
	
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
	
	
}
