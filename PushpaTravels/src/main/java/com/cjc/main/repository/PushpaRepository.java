package com.cjc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Pushpa;

@Repository
public interface PushpaRepository extends JpaRepository<Pushpa,String> 
{

public Pushpa findByBusNumber(String busNumber);

}
