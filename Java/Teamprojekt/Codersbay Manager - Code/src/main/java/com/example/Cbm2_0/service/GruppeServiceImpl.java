package com.example.Cbm2_0.service;

import com.example.Cbm2_0.model.Gruppe;
import com.example.Cbm2_0.model.Person;
import com.example.Cbm2_0.repository.GruppeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GruppeServiceImpl implements GruppeService{

    @Autowired
    private GruppeRepository gruppeRepository;


    @Override
    public List<Gruppe> getAllGroups() {
        return gruppeRepository.findAll();
    }


    @Override
    public void saveGruppe(Gruppe gruppe) {
        this.gruppeRepository.save(gruppe);
    }

    @Override
    public Gruppe getGruppeById(long id) {
        Optional<Gruppe> optional = gruppeRepository.findById(id);
        Gruppe gruppe = null;
        if(optional.isPresent()) {
            gruppe = optional.get();
        }else {
            throw new RuntimeException("Gruppe mit id: " + id + " nicht gefunden");
        }
        return gruppe;
    }
    @Override
    public void deleteGruppeById(long id) {
        this.gruppeRepository.deleteById(id);
    }
}
