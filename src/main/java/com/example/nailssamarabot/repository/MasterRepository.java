package com.example.nailssamarabot.repository;

import com.example.nailssamarabot.entity.MasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterRepository  extends JpaRepository<MasterEntity, Long> {
}
