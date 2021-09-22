package com.example.Cbm2_0.service;

import com.example.Cbm2_0.model.Person;
import com.example.Cbm2_0.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService{

    //----------Injection der PersonRepository---------
    @Autowired
    private PersonRepository personRepository;

    //----------Returns a list of persons to the PersonController--
    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll(Sort.by(Sort.Direction.ASC, "nachname"));
    }

    @Override
    public void savePerson(Person person) {
        this.personRepository.save(person);
    }








    @Override
    public Person getPersonById(long id) {
        Optional<Person> optional = personRepository.findById(id);
        Person person = null;
        if(optional.isPresent()) {
            person = optional.get();
        }else {
            throw new RuntimeException("Teilnehmer mit id: " + id + " nicht gefunden");
        }
        return person;
    }









    @Override
    public void deletePersonById(long id) {
        this.personRepository.deleteById(id);
    }

    public List <Person> findByKeyword(String keyword){
        return personRepository.findByKeyword(keyword);
    }

    @Override
    public List<Person> findByGruppenname(String keyword) {
        return personRepository.findByGruppenname(keyword);
    }

    @Override
    public List<Person> findByAusbildungszweigQuali() {
        return personRepository.findByAusbildungszweigQuali();
    }

    @Override
    public List<Person> findByAusbildungszweigNetz() {
        return personRepository.findByAusbildungszweigNetz();
    }

    @Override
    public List<Person> findByAusbildungszweigSoft() {
        return personRepository.findByAusbildungszweigSoft();
    }

    /*@Override
    public long getCountOfPersons() {
        long count = personRepository.count();
        return count;
    }*/

    @Override
    public long count() {
        long count = personRepository.count();
        return count;
    }

    @Override
    public long countQuali() {
        long countQuali = personRepository.countQuali();
        return countQuali;

    }

    @Override
    public long countNetz() {
        long countNetz = personRepository.countNetz();
        return countNetz;
    }

    @Override
    public long countSoft() {
        long countSoft = personRepository.countSoft();
        return countSoft;
    }


}
