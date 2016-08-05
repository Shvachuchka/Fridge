package ua.lviv.lgs.dao;


import ua.lviv.lgs.entity.Refrigerator;

import java.util.List;

public interface RefrigeratorDao {

    void add(Refrigerator refrigerator);
    void edit(Refrigerator refrigerator);
    void delete(Refrigerator refrigerator);
    Refrigerator findOne(int id);
    List< Refrigerator> findAll();
}
