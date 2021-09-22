package com.example.Cbm2_0.model;

import javax.persistence.*;

@Entity
@Table(name ="gruppen")
public class Gruppe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;
    @Column
    private String ausbildungszweig;
    @Column
    private String gruppenNummer;
    @Column
    private String kursbeginn;
    @Column
    private String kursende;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAusbildungszweig() {
        return ausbildungszweig;
    }

    public void setAusbildungszweig(String ausbildungszweig) {
        this.ausbildungszweig = ausbildungszweig;
    }

    public String getGruppenNummer() {
        return gruppenNummer;
    }

    public void setGruppenNummer(String gruppenNummer) {
        this.gruppenNummer = gruppenNummer;
    }

    public String getKursbeginn() {
        return kursbeginn;
    }

    public void setKursbeginn(String kursbeginn) {
        this.kursbeginn = kursbeginn;
    }

    public String getKursende() {
        return kursende;
    }

    public void setKursende(String kursende) {
        this.kursende = kursende;
    }
}
