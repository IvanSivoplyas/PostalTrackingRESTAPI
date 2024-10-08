package com.silvan.springshipmentservice.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.io.Serializable;


public class OfficeDTO implements Serializable {
    @Size(min = 6, max = 6,message = "index consists of six digits only") int index;
    @NotEmpty(message = "office should have a name") String name;
    @NotEmpty(message = "office should have an address") String address;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
