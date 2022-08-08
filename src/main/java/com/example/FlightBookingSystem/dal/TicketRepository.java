package com.example.FlightBookingSystem.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FlightBookingSystem.Model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

	
}
