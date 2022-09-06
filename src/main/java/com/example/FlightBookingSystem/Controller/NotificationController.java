package com.example.FlightBookingSystem.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.FlightBookingSystem.Model.Notification;
import com.example.FlightBookingSystem.Model.Passenger;
import com.example.FlightBookingSystem.Service.NotificationService;

@Controller
public class NotificationController {

	private NotificationService notificationService;

	public NotificationController(NotificationService notificationService) {
		super();
		this.notificationService = notificationService;
	}
	
	@GetMapping("deleteNotification")
	public String deleteNotificationWithId(@RequestParam Long id, HttpSession httpSession, Model model) {
		notificationService.remove(id);
		Passenger passenger = (Passenger)httpSession.getAttribute("passenger");
		List<Notification> userNotifications = notificationService.getNotificationForUser(passenger.getId());
		model.addAttribute("notifications", userNotifications);
		return "viewAllNotifications";
	}
	
	@GetMapping("viewAllNotifications")
	public String viewAllUnreadNotifications(HttpSession httpSession, Model model) {
		Passenger passenger = (Passenger)httpSession.getAttribute("passenger");
		List<Notification> userNotifications = notificationService.getNotificationForUser(passenger.getId());
		model.addAttribute("notifications", userNotifications);
		notificationService.changeToReadNotifications(userNotifications);
		return "viewAllNotifications";
	}
	
	@GetMapping("deleteAllNotifications")
	public String deleteUserAllNotification() {
		//TODO finish the delete notification setup
		return "viewAllNotifications";
	}
}
