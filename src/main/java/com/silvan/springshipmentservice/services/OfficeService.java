package com.silvan.springshipmentservice.services;

import com.silvan.springshipmentservice.models.Office;
import com.silvan.springshipmentservice.repositories.OfficeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OfficeService {
    private final OfficeRepository officeRepository;

    public OfficeService(OfficeRepository officeRepository) {
        this.officeRepository = officeRepository;
    }
    public List<Office> findAllOffices(){
        return officeRepository.findAll();
    }
    public Office findOfficeById(int id){
        Optional<Office> foundOffice = officeRepository.findById(id);

        return foundOffice.orElse(null);
    }
    @Transactional
    public Office save(Office office){
        return officeRepository.save(office);
    }
    @Transactional
    public Office update(int id, Office updatedOffice){
        updatedOffice.setId(id);
        officeRepository.save(updatedOffice);
        return updatedOffice;
    }
    @Transactional
    public void delete(int id){
        officeRepository.deleteById(id);
    }

}
