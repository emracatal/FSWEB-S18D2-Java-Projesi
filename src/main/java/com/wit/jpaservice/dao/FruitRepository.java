package com.wit.jpaservice.dao;

import com.wit.jpaservice.dto.FruitResponseRecord;
import com.wit.jpaservice.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit,Long> {
    //@Query("SELECT f FROM Fruit f WHERE f.price IS NOT NULL ORDER BY f.price ASC")
    //List<FruitResponseRecord> findAllPriceSorted();

    //TODO Hem FruitRepository için hem VegetableRepository için "ücrete göre artan sırada" tüm fruit ve vegatables sıralayan bir method yazmalısınız
    // Hem FruitRepository için hem VegetableRepository yollanan bir parametre name içerisinde geçiyorsa geçtiği tüm kayıtları dönen bir metod yazmalısınız.
}
