package com.example.Cbm2_0.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "personen")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String vorname;

    @Column
    private String nachname;

    @Column
    private String telefon;

    @Column

    private String email;

    @Column
    private String adresse;


    @Column
    private String geburtsdatum;

    @Column
    private String ausbildungszweig;

    @Column
    private String gruppenname;

    @Column
    private String kursbeginn;

    @Column
    private String kursende;

    @Column
    private String notizen;

    @Column
    private Integer beurteilung;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAusbildungszweig() {
        return ausbildungszweig;
    }

    public void setAusbildungszweig(String ausbildungszweig) {
        this.ausbildungszweig = ausbildungszweig;
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

    public String getNotizen() {
        return notizen;
    }

    public void setNotizen(String notizen) {
        this.notizen = notizen;
    }

    public String getGruppenname() {
        return gruppenname;
    }

    public void setGruppenname(String gruppenname) {
        this.gruppenname = gruppenname;
    }

    public Integer getBeurteilung() {
        return beurteilung;
    }

    public void setBeurteilung(Integer beurteilung) {
        this.beurteilung = beurteilung;
    }
}
