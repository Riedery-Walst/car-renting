package com.example.naumenwebproject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@JsonIgnoreProperties("orderItems")
    // Посмотреть гайд по аннотации. Попробовать выставить cascade.all
    // Посмотреть правильно ли мапится
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    List<OrderItem> orderItems = new ArrayList<>();

    @Column(name = "date_order")
    private LocalDateTime date;

    @Column(name = "paid")
    private Boolean paid;

    @Column(name = "active")
    private Boolean active;
}
