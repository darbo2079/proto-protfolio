package com.example.Cbm2_0.service;

import com.example.Cbm2_0.model.Gruppe;

import java.util.List;

public interface GruppeService {

    List<Gruppe> getAllGroups();

    void saveGruppe(Gruppe gruppe);

    Gruppe getGruppeById(long id);
    void deleteGruppeById(long id);
}
