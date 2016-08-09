package ua.lviv.lgs.services;


import ua.lviv.lgs.entity.People;

import java.util.List;

public interface PeopleService {

    void addOrEdit(People people);
    void delete(int id_People);
    People findOne(int id_People);
    List<People> findAll();

}
