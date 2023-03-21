package com.example.nailssamarabot.repository;

import com.example.nailssamarabot.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long>{
    ClientEntity getClientEntityByPhoneNumber(String phoneNumber);
}
