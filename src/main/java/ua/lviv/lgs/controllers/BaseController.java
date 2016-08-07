package ua.lviv.lgs.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.lviv.lgs.services.PeopleService;




@Controller
public class BaseController {

    @Autowired
    private PeopleService peopleService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home (){
        return "home";
    }




}



