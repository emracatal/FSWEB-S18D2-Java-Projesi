package com.wit.jpaservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="fruit",schema ="s18d2" )
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fruit {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private double price;

    @Enumerated(EnumType.STRING)
    private FruitType fruitType;
}
