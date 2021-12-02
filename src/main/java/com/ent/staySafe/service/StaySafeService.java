package com.ent.staySafe.service;

import java.util.List;

import com.ent.staySafe.entity.Stay;

public interface StaySafeService {
	
	public void save(Stay theStay);
	
	public List<Stay> findAll();

}
