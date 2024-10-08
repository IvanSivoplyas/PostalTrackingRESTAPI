package com.silvan.springshipmentservice.controllers;

import com.silvan.springshipmentservice.models.Shipment;
import com.silvan.springshipmentservice.services.ShipmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {
    private final ShipmentService shipmentService;

    public ShipmentController(ShipmentService shipmentService) {
        this.shipmentService = shipmentService;

    }

    @PostMapping("/shipments/new")
    public Shipment registerShipment(Shipment shipment){
        return shipmentService.save(shipment);
    }

    @GetMapping("/shipments")
    public List<Shipment> readShipments(){
        return shipmentService.findAllShipments();
    }

    @GetMapping("/shipments/{id}")
    public Shipment readShipment(@PathVariable int id){
        return shipmentService.findShipmentById(id);
    }

    @PatchMapping("/shipments/{id}/update")
    public Shipment updateShipment(@PathVariable int id, @RequestBody Shipment shipment){
        return shipmentService.update(id, shipment);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteShipment(@PathVariable int id){
        shipmentService.delete(id);
    }
}
