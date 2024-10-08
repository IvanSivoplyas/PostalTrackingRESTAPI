package com.silvan.springshipmentservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "office")
public class Office {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "office_index")
    private int index;

    @Column(name = "office_name")
    private String name;

    @Column(name = "office_address")
    private String address;

    public Office(int index, String name, String address) {
        this.index = index;
        this.name = name;
        this.address = address;
    }
}
