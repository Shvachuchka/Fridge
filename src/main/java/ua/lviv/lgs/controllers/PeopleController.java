package ua.lviv.lgs.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.lviv.lgs.entity.People;
import ua.lviv.lgs.services.PeopleService;
import java.security.Principal;
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
    private String newPeople(Model model){
        model.addAttribute("people", new People());
        return "peopleNew";
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
              return "peoplePage";
    }

     @RequestMapping(value = "/people/edit/{id}", method = RequestMethod.GET)
         public String edit(@PathVariable String id, Model model){
             model.addAttribute("people", peopleService.findOne(Integer.parseInt(id)));
         return "peopleEdit";
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

    public String registration(@ModelAttribute People people){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        people.setPassword(bCryptPasswordEncoder.encode(people.getPassword()));
        peopleService.add(people);
        peopleService.addOrEdit(people);
        return "redirect:/";
    }

    @RequestMapping(value = "/cabinet", method = RequestMethod.GET)
    public String cabinet(Principal principal, Model model){
        model.addAttribute("people", peopleService.findOne(Integer.parseInt(principal.getName())));
       return "cabinet";
    }




}
