package ua.lviv.lgs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.lviv.lgs.entity.People;
import ua.lviv.lgs.services.PeopleService;

import java.util.List;

@Controller
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @RequestMapping(value = "/people/all", method = RequestMethod.GET)
    public String peopleAll (Model model){
        List<People> peopleList = peopleService.findAll();
        model.addAttribute("people", peopleList);
        return "peopleAll";
    }

    @RequestMapping(value = "/people/new", method = RequestMethod.GET)
    private String NewPeople(Model model){
        model.addAttribute("people", new People());
        return "peopleNew";
    }

   /* @RequestMapping(value = "/people/create", method = RequestMethod.POST)
    public String createPeople(@RequestParam("namePeople")String namePeople,@RequestParam("surname")String surname, @RequestParam("password")String password){
        peopleService.add(namePeople,surname,password);
        return "redirect:/people/all";
    } */

    @RequestMapping(value = "/people/create", method = RequestMethod.POST)
    public String createPeople(@ModelAttribute People people){
        peopleService.add(people);
        return "redirect:/people/all";
    }

    @RequestMapping(value = "/people/page/{id}", method = RequestMethod.GET)
    public String peoplePage(@PathVariable String id, Model model){
        People people = peopleService.findOne(Integer.parseInt(id));
        model.addAttribute("people", people);
        return "peoplePage";
    }


}
