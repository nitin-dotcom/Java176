package com.cjc.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Passenger 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pasengerId;
	private String passengerName;
	private int age;
	private String gender;
	private long passengerContact;
	private String passengerPickupPoint;
	private String passengerDropPoint;


}
