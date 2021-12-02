package com.ent.staySafe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ent.staySafe.dao.StaySafeRepository;
import com.ent.staySafe.entity.Stay;

@Service
public class StaySafeServiceImpl implements StaySafeService  {
	
	private StaySafeRepository staySafeRepository;
	
	@Autowired
	public StaySafeServiceImpl (StaySafeRepository theStaySafeRepository) {
		staySafeRepository = theStaySafeRepository;
	}

	public void save(Stay theStay) {
		staySafeRepository.save(theStay);

	}
	
	@Override
	public List<Stay> findAll() {
		// TODO Auto-generated method stub
		return staySafeRepository.findAllByOrderByLastNameAsc();
	}
}
