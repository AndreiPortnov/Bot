package com.example.nailssamarabot.entity;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Table(name = "master")
@Data
public class MasterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "master_id")
    private Long masterId;


    @Column(name = "master_name")
    private String name;

    @Column(name = "skill_level")
    @Enumerated(EnumType.ORDINAL)
    private MasterSkillLevel skillLevel;
}
