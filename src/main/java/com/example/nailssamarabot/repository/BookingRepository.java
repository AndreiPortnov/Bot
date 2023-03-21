package com.example.nailssamarabot.repository;

import com.example.nailssamarabot.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository  extends JpaRepository<BookingEntity, Long> {
}
