package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.main.model.Passenger;
import com.cjc.main.model.Pushpa;
import com.cjc.main.service.PushpaService;

@RestController
public class PushpaController 
{
	@Autowired PushpaService pushpaservice;
	
	
	@PostMapping("/postPushpa")
	public ResponseEntity<Pushpa> savePushpa(@RequestBody Pushpa p)
	{
		Pushpa pu=pushpaservice.postPushpa(p);
		
		return new ResponseEntity<Pushpa>(pu,HttpStatus.OK);
	}
	
	@PutMapping("/updatePassenger/{busNumber}/{seatId}")
	public ResponseEntity<Pushpa> updatePassenger(@RequestBody Passenger passenger,
			                                       @PathVariable String busNumber,
			                                        @PathVariable int seatId)
	{
		Pushpa push=pushpaservice.update(passenger,busNumber,seatId);
		
		return new ResponseEntity<Pushpa>(push,HttpStatus.OK);
	}
	

}
