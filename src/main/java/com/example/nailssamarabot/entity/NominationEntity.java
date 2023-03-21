package com.example.nailssamarabot.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "nomination")
@Data
public class NominationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nomination_id")
    private Long nominationId;

    @Column(name = "name_of_nomination")
    private String NameNomination;

}
