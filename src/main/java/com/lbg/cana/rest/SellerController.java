package com.lbg.cana.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lbg.cana.domain.Seller;
import com.lbg.cana.service.SellerService;

@RestController
@RequestMapping("/sellers")

public class SellerController {

	private SellerService service;

	public SellerController(SellerService service) {
		super();
		this.service = service;

	}

	@PostMapping("/create")

	public ResponseEntity<Seller> createSeller(@RequestBody Seller newSeller) {
		return this.service.createSeller(newSeller);
	}

	@GetMapping("/get")

	public List<Seller> getSeller() {
		return this.service.getSeller();

	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Seller> getSeller(@PathVariable int id) {
		return this.service.getSeller(id);
	}
}
