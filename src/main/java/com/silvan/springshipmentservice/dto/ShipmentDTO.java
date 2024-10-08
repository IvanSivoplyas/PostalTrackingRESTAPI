package com.silvan.springshipmentservice.dto;

import com.silvan.springshipmentservice.enumerations.Status;
import com.silvan.springshipmentservice.enumerations.Type;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class ShipmentDTO {
    @NotEmpty(message = "shipment should have a name")
    private String shipmentName;

    @NotNull(message = "type of the shipmen should be determined")
    private Type shipmentType;

    @NotNull(message = "status of the shipment should be determined")
    private Status status;

    public String getShipmentName() {
        return shipmentName;
    }
    public void setShipmentName(String shipmentName) {
        this.shipmentName = shipmentName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Type getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(Type shipmentType) {
        this.shipmentType = shipmentType;
    }
}
