package ru.krjava.event_agency.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String prad;
    private String ved;
    private String request;
    private String notification;
    private long userid;
}