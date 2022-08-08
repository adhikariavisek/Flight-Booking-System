package com.example.FlightBookingSystem;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.FlightBookingSystem.Model.Flight;
import com.example.FlightBookingSystem.Model.Passenger;
import com.example.FlightBookingSystem.Model.Plane;
import com.example.FlightBookingSystem.Model.Ticket;
import com.example.FlightBookingSystem.dal.FlightRepository;
import com.example.FlightBookingSystem.dal.PassengerRepository;
import com.example.FlightBookingSystem.dal.PlaneRepository;
import com.example.FlightBookingSystem.dal.TicketRepository;

@Component
public class Runner implements ApplicationRunner {

	private FlightRepository flightRepo;
	private PassengerRepository passengerRepo;
	private PlaneRepository planeRepo;
	private TicketRepository ticketRepo;
	
	
	
	@Autowired
	public Runner(FlightRepository flightRepo, PassengerRepository passengerRepo, PlaneRepository planeRepo,
			TicketRepository ticketRepo) {
		super();
		this.flightRepo = flightRepo;
		this.passengerRepo = passengerRepo;
		this.planeRepo = planeRepo;
		this.ticketRepo = ticketRepo;
	}



	/**
	 * DataLoader with predetermined flight and plane data
	 */
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Passenger passenger1 = new Passenger("Avisek Adhikari", "avsk", "12345", "adhikariavisek@gmail.com", 11184554L, 0416116354L);	
		passengerRepo.save(passenger1);

		Passenger passenger2 = new Passenger("Anupam Adhikari", "anup", "54321", "adhikarianupam@gmail.com", 11145345L, 0413534116354L);
		passengerRepo.save(passenger2);
		
		Plane plane1 = new Plane(150, "T501", null);
		Plane plane2 = new Plane(240, "T503", null);
		Plane plane3 = new Plane(150, "A-T1Z", null);
		Plane plane4 = new Plane(240, "T502", null);
		Plane plane5 = new Plane(150, "Alpha-1", null);
		Plane plane6 = new Plane(240, "Beta-B", null);
		
		planeRepo.save(plane1);
		planeRepo.save(plane2);
		planeRepo.save(plane3);
		planeRepo.save(plane4);
		planeRepo.save(plane5);
		planeRepo.save(plane6);
		
		
		List<Flight> flightsToPerth = new ArrayList<Flight>();
		List<Flight> flightsToSydney = new ArrayList<Flight>();
		
		
		flightsToPerth.add(new Flight("Sydney", "Melbourne", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Sydney", "Adelaide", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Sydney", "Perth", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Melbourne", "Sydney", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Melbourne", "Adelaide", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Melbourne", "Perth", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Adelaide", "Sydney", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Adelaide", "Melbourne", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Adelaide", "Perth", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Perth", "Sydney", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		
		flightsToPerth.add(new Flight("Perth", "Melbourne", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Perth", "Adelaide", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Sydney", "Melbourne", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Sydney", "Adelaide", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Sydney", "Perth", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Melbourne", "Sydney", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Melbourne", "Adelaide", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Melbourne", "Perth", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Adelaide", "Sydney", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Adelaide", "Melbourne", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		
		flightsToPerth.add(new Flight("Adelaide", "Perth", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Perth", "Sydney", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Perth", "Melbourne", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Perth", "Adelaide", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Sydney", "Melbourne", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Sydney", "Adelaide", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Sydney", "Perth", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Melbourne", "Sydney", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Melbourne", "Adelaide", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToPerth.add(new Flight("Melbourne", "Perth", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		
		
		
		
		flightsToSydney.add(new Flight("Sydney", "Melbourne", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Sydney", "Adelaide", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Sydney", "Perth", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Melbourne", "Sydney", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Melbourne", "Adelaide", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Melbourne", "Perth", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Adelaide", "Sydney", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Adelaide", "Melbourne", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Adelaide", "Perth", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Perth", "Sydney", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		
		flightsToSydney.add(new Flight("Perth", "Melbourne", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Perth", "Adelaide", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Sydney", "Melbourne", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Sydney", "Adelaide", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Sydney", "Perth", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Melbourne", "Sydney", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Melbourne", "Adelaide", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Melbourne", "Perth", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Adelaide", "Sydney", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Adelaide", "Melbourne", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		
		flightsToSydney.add(new Flight("Adelaide", "Perth", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Perth", "Sydney", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Perth", "Melbourne", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Perth", "Adelaide", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Sydney", "Melbourne", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Sydney", "Adelaide", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Sydney", "Perth", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Melbourne", "Sydney", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Melbourne", "Adelaide", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		flightsToSydney.add(new Flight("Melbourne", "Perth", "2022/08/10 10:30", "2022/08/10 12:05", null, 26.5));
		
		
		List<Flight> firstPlaneFlights = new ArrayList<Flight>();
		List<Flight> secondPlaneFlights = new ArrayList<Flight>();
		List<Flight> thirdPlaneFlights = new ArrayList<Flight>();
		List<Flight> fourthPlaneFlights = new ArrayList<Flight>();
		List<Flight> fifthPlaneFlights = new ArrayList<Flight>();
		List<Flight> sixthPlaneFlights = new ArrayList<Flight>();
		
		for(int i = 0; i < 5; i++) {
			firstPlaneFlights.add(flightsToPerth.get(i));
		}
		
		for(int i = 0; i < 5; i++) {
			firstPlaneFlights.add(flightsToSydney.get(i));
		}
		
		for(int i = 5; i < 10; i++) {
			secondPlaneFlights.add(flightsToPerth.get(i));
		}
		
		for(int i = 5; i < 10; i++) {
			secondPlaneFlights.add(flightsToSydney.get(i));
		}
		
		for(int i = 10; i < 15; i++) {
			thirdPlaneFlights.add(flightsToPerth.get(i));
		}
		
		for(int i = 10; i < 15; i++) {
			thirdPlaneFlights.add(flightsToSydney.get(i));
		}
		
		for(int i = 15; i < 20; i++) {
			fourthPlaneFlights.add(flightsToPerth.get(i));
		}
		
		for(int i = 15; i < 20; i++) {
			fourthPlaneFlights.add(flightsToSydney.get(i));
		}
		
		for(int i = 20; i < 25; i++) {
			fifthPlaneFlights.add(flightsToPerth.get(i));
		}
		
		for(int i = 20; i < 25; i++) {
			fifthPlaneFlights.add(flightsToSydney.get(i));
		}
		
		for(int i = 25; i < 30; i++) {
			sixthPlaneFlights.add(flightsToPerth.get(i));
		}
		
		for(int i = 25; i < 30; i++) {
			sixthPlaneFlights.add(flightsToSydney.get(i));
		}
		
		plane1.setFlights(firstPlaneFlights);
		plane2.setFlights(secondPlaneFlights);
		plane3.setFlights(thirdPlaneFlights);
		plane4.setFlights(fourthPlaneFlights);
		plane5.setFlights(fifthPlaneFlights);
		plane6.setFlights(sixthPlaneFlights);
		
		
		for(int i = 0; i < 5; i++) {
			flightsToPerth.get(i).setPlane(plane1);
		}
		
		for(int i = 0; i < 5; i++) {
			flightsToSydney.get(i).setPlane(plane1);
		}
		
		for(int i = 5; i < 10; i++) {
			flightsToPerth.get(i).setPlane(plane2);
		}
		
		for(int i = 5; i < 10; i++) {
			flightsToSydney.get(i).setPlane(plane2);
		}
		
		for(int i = 10; i < 15; i++) {
			flightsToPerth.get(i).setPlane(plane3);
		}
		
		for(int i = 10; i < 15; i++) {
			flightsToSydney.get(i).setPlane(plane3);
		}
		
		for(int i = 15; i < 20; i++) {
			flightsToPerth.get(i).setPlane(plane4);
		}
		
		for(int i = 15; i < 20; i++) {
			flightsToSydney.get(i).setPlane(plane4);
		}
		
		for(int i = 20; i < 25; i++) {
			flightsToPerth.get(i).setPlane(plane5);
		}
		
		for(int i = 20; i < 25; i++) {
			flightsToSydney.get(i).setPlane(plane5);
		}
		
		for(int i = 25; i < 30; i++) {
			flightsToPerth.get(i).setPlane(plane6);
		}
		
		for(int i = 25; i < 30; i++) {
			flightsToSydney.get(i).setPlane(plane6);
		}
		
		
		for(Flight flight : flightsToPerth) {
			flightRepo.save(flight);
		}
		
		for(Flight flight : flightsToSydney) {
			flightRepo.save(flight);
		}
		

		
	}

}
