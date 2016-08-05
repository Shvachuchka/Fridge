package ua.lviv.lgs.services;


import ua.lviv.lgs.entity.People;

import java.util.List;

public interface PeopleService {

    void add(String namePeople, String surname, String password);
    void edit(int id_People, String namePeople, String surname, String password, String passwordConfirm);
    void delete(int id_People);
    People findOne(int id_People);
    List<People> findAll();

     void add(People people);
}
