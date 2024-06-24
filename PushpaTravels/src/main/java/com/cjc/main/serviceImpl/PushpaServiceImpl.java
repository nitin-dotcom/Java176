package com.cjc.main.serviceImpl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Passenger;
import com.cjc.main.model.Pushpa;
import com.cjc.main.model.Seat;
import com.cjc.main.repository.PushpaRepository;
import com.cjc.main.service.PushpaService;

@Service
public class PushpaServiceImpl implements PushpaService 
{
	@Autowired
	PushpaRepository pushparepository;

	@Override
	public Pushpa postPushpa(Pushpa p) 
	{
		Set<Seat> set=new HashSet<Seat>();
		
	for(int i=1;i<=p.getBusSeatingCapacity();i++)
	{
		Seat seat=new Seat();
		
		if(i>=20)
		{
			seat.setSeatNumber("U" +i);
			seat.setSeatStatus("Available");
		}
		if(i<20)
		{
			seat.setSeatNumber("L" +i);
			seat.setSeatStatus("Available");
		}
		set.add(seat);
	 }
	p.setSeats(set);
	
	return pushparepository.save(p);
	
   
}

	@Override
	public Pushpa update(Passenger passenger, String busNumber, int seatId) 
	{
		Pushpa p=pushparepository.findByBusNumber(busNumber);
		
		Set<Seat> seat=p.getSeats();
		
		for(Seat sseat:seat)
		{
			if(sseat.getSeatId()==seatId)
			{
				sseat.setSeatStatus("Booked");
				sseat.setPassenger(passenger);
			}
		}
		return pushparepository.save(p);
	}
	}


