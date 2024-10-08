package com.silvan.springshipmentservice.repositories;

import com.silvan.springshipmentservice.models.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Integer> {
}
