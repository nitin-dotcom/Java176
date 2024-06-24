package com.cjc.main.service;

import com.cjc.main.model.Passenger;
import com.cjc.main.model.Pushpa;

public interface PushpaService 
{

	public Pushpa postPushpa(Pushpa p);

	public Pushpa update(Passenger passenger, String busNumber, int seatId);

}
