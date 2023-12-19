package com.wit.jpaservice.services;

import com.wit.jpaservice.dao.FruitRepository;
import com.wit.jpaservice.dto.FruitResponseRecord;
import com.wit.jpaservice.entity.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FruitServiceImpl implements FruitService{
    private FruitRepository fruitRepository;
    @Autowired
    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public Fruit save(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    //@Override
    //public List<FruitResponseRecord> findAllPriceSorted() {
    //    return fruitRepository.findAllPriceSorted();
    //}
}
