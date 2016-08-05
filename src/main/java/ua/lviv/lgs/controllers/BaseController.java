package ua.lviv.lgs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.lviv.lgs.entity.People;
import ua.lviv.lgs.services.PeopleService;

import java.util.List;


@Controller
public class BaseController {

    @Autowired
    private PeopleService peopleService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "views-base-home";
    }




}



