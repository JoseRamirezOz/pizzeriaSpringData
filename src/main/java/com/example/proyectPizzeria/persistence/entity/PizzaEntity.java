package com.example.proyectPizzeria.persistence.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "pizza")
public class PizzaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pizza", nullable = false)
    private Integer idPizza;






    @Column(name ="nombre")
    private String nombre;
}
