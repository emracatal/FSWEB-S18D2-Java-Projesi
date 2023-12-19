package com.wit.jpaservice.services;

import com.wit.jpaservice.dao.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VegetableServiceImpl implements VegetableService{
    private VegetableRepository vegetableRepository;
    @Autowired

    public VegetableServiceImpl(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }
}
