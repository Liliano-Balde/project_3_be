package com.lbg.cana.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lbg.cana.domain.Booking;
import com.lbg.cana.service.BookingService;

@RequestMapping("/bookings")
@RestController
public class BookingController {

	private BookingService service;

	public BookingController(BookingService service) {
		super();
		this.service = service;
	}

	@PostMapping("/create")
	public ResponseEntity<Booking> createBooking(@RequestBody Booking newBooking) {

		return this.service.createBooking(newBooking);
	}

	@GetMapping("/get")
	public List<Booking> getBooking() {
		return this.service.getBooking();
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Booking> getBooking(@PathVariable int id) {

		return this.service.getBooking(id);
	}
}
