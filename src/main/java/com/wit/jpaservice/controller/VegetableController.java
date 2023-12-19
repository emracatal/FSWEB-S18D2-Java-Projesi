package com.wit.jpaservice.controller;


import com.wit.jpaservice.dao.FruitRepository;
import com.wit.jpaservice.dao.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vegetables")
public class VegetableController {
    private VegetableRepository vegetableRepository;

    @Autowired
    public VegetableController(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }


}
