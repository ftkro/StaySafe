package com.ent.staySafe.dao;

import java.util.List;

import com.ent.staySafe.entity.StaySafe;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StaySafeRepository extends JpaRepository<StaySafe,Integer>{

    //method to sort results by last name
    public List<StaySafe> findAllByLastNameAsc();

    //method to sort results by room number
    public List<StaySafe> findAllByRoomNumberAsc();

    //method to sort results by check-in date
    public List<StaySafe> findAllByCheckinDate();
}
