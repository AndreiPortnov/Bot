package com.example.nailssamarabot.repository;

import com.example.nailssamarabot.entity.NominationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NominationRepository extends JpaRepository<NominationEntity, Long> {
}
