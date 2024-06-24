package com.cjc.main.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class Pushpa 
{

	@Id
	private String busNumber;
	private String busAgencyName;
	private String busOwnerName;
	private String busDriverName;
	private String busCoDriverName;
	private int busSeatingCapacity;
	private float busTicketPrice;
	private String fromLocation;
	private String toLocation;
	private String onBoardingTime;
	private String dropTime;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Seat> seats=new HashSet<Seat>();

}
