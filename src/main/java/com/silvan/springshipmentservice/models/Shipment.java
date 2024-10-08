package com.silvan.springshipmentservice.models;

import com.silvan.springshipmentservice.enumerations.Status;
import com.silvan.springshipmentservice.enumerations.Type;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "shipment")
@Getter
@Setter
@NoArgsConstructor
public class Shipment {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "shipment_name")
    private String shipmentName;

    @Column(name = "shipment_type")
    @Enumerated(value = EnumType.STRING)
    private Type shipmentType;

    @Column(name = "receiver_index")
    private int receiverIndex;

    @Column(name = "receiver_address")
    private String receiverAddress;

    @Column(name = "receiver_name")
    private String receiverName;

    @Column(name = "shipment_status")
    @Enumerated(value = EnumType.STRING)
    private Status shipmentStatus;

    @OneToMany
    private List<Office> shipmentHistory;

    public Shipment(Type shipmentType, int receiverIndex, String receiverAddress, String receiverName, Status shipmentStatus) {
        this.shipmentType = shipmentType;
        this.receiverIndex = receiverIndex;
        this.receiverAddress = receiverAddress;
        this.receiverName = receiverName;
        this.shipmentStatus = shipmentStatus;
    }
}
