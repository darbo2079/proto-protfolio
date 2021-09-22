package com.example.Cbm2_0.repository;

import com.example.Cbm2_0.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    //Custom Query für die Suche/das Filtern mit Inputfeld (keyword)
    //@Param gibt URL wert -
    //für diese Methode muß man den Wert "keyword" verwenden

    @Query(value = "select * from personen e where e.vorname like :keyword% or e.nachname like :keyword%", nativeQuery = true)
    List<Person> findByKeyword(@Param("keyword") String keyword);


    @Query(value = "select * from personen e where e.gruppenname = :keyword", nativeQuery = true)
    List<Person> findByGruppenname(@Param("keyword") String keyword);

    @Query(value= "select * from personen e where e.ausbildungszweig like 'quali%' or e.ausbildungszweig like 'Quali%'", nativeQuery = true)
    List<Person> findByAusbildungszweigQuali();

    @Query(value= "select * from personen e where e.ausbildungszweig like 'netz%' or e.ausbildungszweig like 'Netz%'", nativeQuery = true)
    List<Person> findByAusbildungszweigNetz();

    @Query(value= "select * from personen e where e.ausbildungszweig like 'soft%' or e.ausbildungszweig like 'Soft%'", nativeQuery = true)
    List<Person> findByAusbildungszweigSoft();


    @Query(value = "select count(*) from personen e", nativeQuery = true)
    long count();

    @Query(value = "select count(*) from personen e where e.ausbildungszweig like 'quali%' or e.ausbildungszweig like 'Quali%'", nativeQuery = true)
    long countQuali();

    @Query(value = "select count(*) from personen e where e.ausbildungszweig like 'netz%' or e.ausbildungszweig like " +
            "'Netz%'", nativeQuery = true)
    long countNetz();

    @Query(value = "select count(*) from personen e where e.ausbildungszweig like 'soft%' or e.ausbildungszweig like " +
            "'Soft%'", nativeQuery = true)
    long countSoft();

}
