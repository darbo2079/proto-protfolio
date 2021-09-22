package com.example.Cbm2_0.controller;

import com.example.Cbm2_0.model.Gruppe;
import com.example.Cbm2_0.model.Person;
import com.example.Cbm2_0.service.GruppeService;
import com.example.Cbm2_0.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GruppeController {

    @Autowired
    private PersonService personService;
    @Autowired
    private GruppeService gruppeService;

    //-----ruft Seite gruppen.html auf--------


    @GetMapping("/gruppen")
    public String viewGruppen(Model model){
        model.addAttribute("listGroups", gruppeService.getAllGroups());
        return "gruppen";
    }

    //-----ruft Seite neueGruppe.html mit Formular für neue Gruppe auf
    @GetMapping("/neueGruppe")
    public String newGroup(Model model){
        Gruppe gruppe = new Gruppe();
        model.addAttribute("gruppe", gruppe);
        return "neueGruppe";
    }

    @PostMapping("/saveGruppe")
    public String saveGruppe(@ModelAttribute("gruppe") Gruppe gruppe){
        gruppeService.saveGruppe(gruppe);
        return "redirect:/gruppen";
    }


    @GetMapping("/gruppenTeilnehmer{id}")
    public String viewGruppenTeilnehmer(@PathVariable (value = "id") long id, Model model){
        Gruppe gruppe = gruppeService.getGruppeById(id);
        model.addAttribute("gruppe", gruppe);
        String keyword = gruppe.getName();
        System.out.println(keyword);

        model.addAttribute("listPersons", personService.findByGruppenname(keyword));
        System.out.println(model.addAttribute("listPersons", personService.findByGruppenname(keyword)));
        return "gruppenTeilnehmer";
    }
    @GetMapping("/updateGruppe{id}")
    public String updateGruppe(@PathVariable (value = "id") long id, Model model) {

        Gruppe gruppe = gruppeService.getGruppeById(id);

        model.addAttribute("gruppe", gruppe);
        return "updateGruppe";
    }

    @GetMapping("/deleteGruppe{id}")
    public String deleteGruppe(@PathVariable (value = "id") long id){
        this.gruppeService.deleteGruppeById(id);
        return "redirect:/gruppen";
    }
}
