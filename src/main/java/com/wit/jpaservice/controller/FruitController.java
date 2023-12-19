package com.wit.jpaservice.controller;


import com.wit.jpaservice.dao.FruitRepository;
import com.wit.jpaservice.dto.FruitResponseRecord;
import com.wit.jpaservice.entity.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fruits")
public class FruitController {
    private FruitRepository fruitRepository;

    @Autowired

    public FruitController(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @PostMapping("/")
    public FruitResponseRecord save(@RequestBody Fruit fruit) {
        Fruit savedFruit=fruitRepository.save(fruit);
        return new FruitResponseRecord(savedFruit.getName(), savedFruit.getPrice());
        }
    }


