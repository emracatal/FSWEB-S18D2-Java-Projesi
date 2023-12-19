package com.wit.jpaservice.services;

import com.wit.jpaservice.dao.FruitRepository;
import com.wit.jpaservice.dto.FruitResponseRecord;
import com.wit.jpaservice.entity.Fruit;

import java.util.List;

public interface FruitService {
    Fruit save(Fruit fruit);

    //List<FruitResponseRecord> findAllPriceSorted();
}
