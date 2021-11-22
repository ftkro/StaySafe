package com.ent.staySafe.service;

import com.ent.staySafe.entity.StaySafe;

import java.util.List;

public interface StaySafeService {
    //method to find all results
    public List<StaySafe> findAll();

    public StaySafe findById(int uniqueID);

    public void save(StaySafe newEntry);

    public void deleteById(int uniqueID);

}
