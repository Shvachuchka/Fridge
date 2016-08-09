package ua.lviv.lgs.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ua.lviv.lgs.entity.People;
import ua.lviv.lgs.services.PeopleService;
import ua.lviv.lgs.validations.PeopleValidotor;

import java.security.Principal;
import java.util.List;

@Controller
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @Autowired
    private PeopleValidotor peopleValidatorr;

    @RequestMapping(value = "/people/all", method = RequestMethod.GET)
    public String peopleAll (Model model){
        List<People> peopleList = peopleService.findAll();
        model.addAttribute("people", peopleList);
        return "views-people-All";
    }

    @RequestMapping(value = "/people/new", method = RequestMethod.GET)
    private String newPeople(Model model){
        model.addAttribute("people", new People());
        return "views-people-New";
    }

      @RequestMapping(value = "/people/create", method = RequestMethod.POST)
    public String createPeople(@ModelAttribute People people){
        peopleService.addOrEdit(people);
        return "redirect:/people/all";
    }

    @RequestMapping(value = "/people/page/{id}", method = RequestMethod.GET)
      public String peoplePage(@PathVariable String id, Model model){
               People people = peopleService.findOne(Integer.parseInt(id));
                model.addAttribute("people",people);
              return "views-people-page";
    }

     @RequestMapping(value = "/people/edit/{id}", method = RequestMethod.GET)
         public String edit(@PathVariable String id, Model model){
             model.addAttribute("people", peopleService.findOne(Integer.parseInt(id)));
         return "views-people-edit";
           }

    @RequestMapping(value = "/people/edit", method = RequestMethod.POST)
      public String edit(@ModelAttribute People people){
               peopleService.addOrEdit(people);
              return "redirect:/people/page"+String.valueOf(people.getId_People());
           }

    @RequestMapping(value = "/people/delete/{id}", method = RequestMethod.POST)
       public String delete(@PathVariable String id){
              peopleService.delete(Integer.parseInt(id));
               return "redirect:/people/all";
          }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
        public String registration(Model model){
        model.addAttribute("people", new People());
        return "views-base-registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute People people, BindingResult bindingResult) {
        peopleValidatorr.validate(people, bindingResult);
        if (bindingResult.hasErrors()) {
            return "views-base-registration";
        } else {
            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            people.setPassword(bCryptPasswordEncoder.encode(people.getPassword()));
            peopleService.addOrEdit(people);
        }

   // @RequestMapping(value = "/cabinet", method = RequestMethod.GET)
    //    public String cabinet (Principal principal, Model model){
    //        model.addAttribute("people", peopleService.findOne(Integer.parseInt(principal.getName())));
    //        return "views-base-cabinet";
    //    }

    }
}
