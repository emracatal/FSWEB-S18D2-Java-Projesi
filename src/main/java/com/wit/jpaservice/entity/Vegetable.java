package com.wit.jpaservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="vegetable",schema ="s18d2" )
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vegetable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private double price;

    @Column(name="is_grown_on_tree")
    private Boolean isGrownOnTree ;
}
