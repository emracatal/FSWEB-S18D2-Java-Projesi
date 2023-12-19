package com.wit.jpaservice.dao;

import com.wit.jpaservice.dto.VegetableResponseRecord;
import com.wit.jpaservice.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {
//@Query("SELECT v FROM Vegetable v WHERE v.price ORDER BY asc")
    //  List<VegetableResponseRecord> findAllPriceSorted();
}
