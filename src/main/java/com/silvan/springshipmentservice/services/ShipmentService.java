package com.silvan.springshipmentservice.services;

import com.silvan.springshipmentservice.models.Shipment;
import com.silvan.springshipmentservice.repositories.ShipmentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ShipmentService {
    private final ShipmentRepository shipmentRepository;

    public ShipmentService(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }
    public List<Shipment> findAllShipments(){
        return shipmentRepository.findAll();
    }
    public Shipment findShipmentById(int id){
        Optional<Shipment> foundShipment = shipmentRepository.findById(id);

        return foundShipment.orElse(null);
    }
    @Transactional
    public Shipment save(Shipment shipment){
        shipmentRepository.save(shipment);
        return shipment;
    }
    @Transactional
    public Shipment update(int id, Shipment updatedShipment){
        updatedShipment.setId(id);
        return shipmentRepository.save(updatedShipment);
    }
    @Transactional
    public void delete(int id){
        shipmentRepository.deleteById(id);
    }
}
