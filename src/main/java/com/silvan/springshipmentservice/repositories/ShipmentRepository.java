package com.silvan.springshipmentservice.repositories;

import com.silvan.springshipmentservice.models.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment,Integer> {
}
