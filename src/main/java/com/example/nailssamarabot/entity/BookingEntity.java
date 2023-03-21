package com.example.nailssamarabot.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "booking")
@Data
public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "booking_id")
    private Long bookingId;

    @JoinColumn(name = "master_id")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private MasterEntity masterEntity;

    @JoinColumn(name = "client_id")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private ClientEntity clientEntity;

    @Column(name = "date_and_time_creation")
    private LocalDateTime creationDate;

    @Column(name = "date_and_time_miting")
    private LocalDateTime dateAndTime;

    @Column(name = "status")
    @Enumerated(EnumType.ORDINAL)
    private Status status;
}
