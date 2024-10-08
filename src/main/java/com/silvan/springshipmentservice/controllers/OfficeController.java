package com.silvan.springshipmentservice.controllers;

import com.silvan.springshipmentservice.models.Office;
import com.silvan.springshipmentservice.services.OfficeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offices")
public class OfficeController {
    private final OfficeService officeService;

    public OfficeController(OfficeService officeService) {
        this.officeService = officeService;
    }

    @PostMapping("offices/new")
    public Office registerOffice(Office office){
        return officeService.save(office);
    }

    @GetMapping("/offices")
    public List<Office> readOffices(){
        return officeService.findAllOffices();
    }

    @GetMapping("/offices/{id}")
    public Office readOffice(@PathVariable int id){
        return officeService.findOfficeById(id);
    }

    @PatchMapping("offices/{id}/update")
    public Office updateOffice(@PathVariable int id, @RequestBody Office office){
        return officeService.update(id, office);
    }

    @DeleteMapping("offices/{id}/delete")
    private void deleteOffice(@PathVariable int id){
        officeService.delete(id);
    }
}
