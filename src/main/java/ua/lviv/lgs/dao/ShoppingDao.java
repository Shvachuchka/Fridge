package ua.lviv.lgs.dao;


import ua.lviv.lgs.entity.Shopping;

import java.util.List;


public interface ShoppingDao {

    void add(Shopping shopping);
    void edit(Shopping shopping);
    void delete(Shopping shopping);
    Shopping findOne(int id);
    List< Shopping> findAll();
}
