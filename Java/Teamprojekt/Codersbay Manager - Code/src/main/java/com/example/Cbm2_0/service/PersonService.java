package com.example.Cbm2_0.service;

import com.example.Cbm2_0.model.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAllPersons();
    void savePerson(Person person);
    Person getPersonById(long id);
    void deletePersonById(long id);
    List<Person> findByKeyword(String keyword);
    List<Person> findByGruppenname(String keyword);

    List<Person> findByAusbildungszweigQuali();
    List<Person> findByAusbildungszweigNetz();
    List<Person> findByAusbildungszweigSoft();


    long count();
    long countQuali();
    long countNetz();
    long countSoft();


}
