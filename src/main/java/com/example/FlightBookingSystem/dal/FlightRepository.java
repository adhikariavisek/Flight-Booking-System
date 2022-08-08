package com.example.FlightBookingSystem.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.FlightBookingSystem.Model.Flight;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

	/**
	 * Method with query to find flights with given source and destination
	 * @param source
	 * @param destination
	 * @return
	 */
	@Query("SELECT f from Flight f where f.source = :source and f.destination = :destination")
	List<Flight> returnFlightsOnRoute(String source, String destination);
}
