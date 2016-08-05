package ua.lviv.lgs.dao;


import ua.lviv.lgs.entity.People;

import java.util.List;

/**
 * Created by Sasha on 15.07.2016.
 */
public interface PeopleDao {
    void add(People people);
    void edit(People people);
    void delete(People people);
    People findOne(int id);
    List<People> findAll();
}
