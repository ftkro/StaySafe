package com.ent.staySafe.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ent.staySafe.entity.Stay;


public interface StaySafeRepository extends JpaRepository<Stay, Integer> {
	
	//method to sort results by last name in ascending order
//	public List<Stay>findAllByOrderByLastNameAsc();

}
