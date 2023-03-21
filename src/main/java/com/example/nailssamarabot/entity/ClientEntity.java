package com.example.nailssamarabot.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "client")
@Data
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "client_name")
    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;
}
