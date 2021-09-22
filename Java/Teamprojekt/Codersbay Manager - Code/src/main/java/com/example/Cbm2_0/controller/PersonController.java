package com.example.Cbm2_0.controller;

import com.example.Cbm2_0.model.Gruppe;
import com.example.Cbm2_0.model.Person;
import com.example.Cbm2_0.service.GruppeService;
import com.example.Cbm2_0.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/")
    private String viewHome(Model model) {
        model.addAttribute("count", personService.count());
        System.out.println(model.addAttribute(personService.count()));
        model.addAttribute("countQuali", personService.countQuali());
        model.addAttribute("countNetz", personService.countNetz());
        model.addAttribute("countSoft", personService.countSoft());
        return "home";
    }

    //zeige Personenliste-----------------------------------

    @GetMapping("/teilnehmer")
    public String viewPersons(Model model, String keyword){
        if (keyword != null) {
            model.addAttribute("listPersons", personService.findByKeyword(keyword));
        }else {
            model.addAttribute("listPersons", personService.getAllPersons());
        }
        model.addAttribute("count",personService.count());
        return "teilnehmer";
    }


    @GetMapping("/neuerTeilnehmer")
    public String newPerson(Model model){
        Person person = new Person();
        model.addAttribute("person", person);
        return "neuerTeilnehmer";
    }

    @GetMapping("/home")
        public String backHome(Model model)    {
        model.addAttribute("count", personService.count());
        model.addAttribute("countQuali", personService.countQuali());
        model.addAttribute("countNetz", personService.countNetz());
        model.addAttribute("countSoft", personService.countSoft());
            return "home";
    }

    @PostMapping("/saveTeilnehmer")
    public String savePerson(@ModelAttribute("person") Person person){
       personService.savePerson(person);
       return "redirect:/teilnehmer";
    }

    @GetMapping("/updateTeilnehmer{id}")
    public String updatePerson(@PathVariable (value = "id") long id, Model model) {

        Person person = personService.getPersonById(id);

        model.addAttribute("person", person);
        return "updateTeilnehmer";
    }
    @GetMapping("/deleteTeilnehmer{id}")
    public String deletePerson(@PathVariable (value = "id") long id){
        this.personService.deletePersonById(id);
        return "redirect:/teilnehmer";
    }

    @GetMapping("/profil{id}")
    public String viewProfil(@PathVariable (value = "id") long id, Model model) {

        Person person = personService.getPersonById(id);

        model.addAttribute("person", person);
        return "profil";
    }

    @GetMapping("/qualifying")
    public String viewQuali(Model model, String keyword){
        if (keyword != null) {
            model.addAttribute("listPersons", personService.findByKeyword(keyword));
        }else {
            model.addAttribute("listPersons", personService.findByAusbildungszweigQuali());
        }
        return "qualifying";
    }
    @GetMapping("/netzwerk")
    public String viewNetz(Model model, String keyword){
        if (keyword != null) {
            model.addAttribute("listPersons", personService.findByKeyword(keyword));
        }else {
            model.addAttribute("listPersons", personService.findByAusbildungszweigNetz());
        }
        return "netzwerk";
    }
    @GetMapping("/software")
    public String viewSoft(Model model, String keyword){
        if (keyword != null) {
            model.addAttribute("listPersons", personService.findByKeyword(keyword));
        }else {
            model.addAttribute("listPersons", personService.findByAusbildungszweigSoft());
        }
        return "software";
    }


}
