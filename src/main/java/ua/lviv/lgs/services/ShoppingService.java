package ua.lviv.lgs.services;


import ua.lviv.lgs.entity.Shopping;

import java.util.List;


public interface ShoppingService {

    void addOrEdit(Shopping shopping);
    void delete(int id_Shopping);
    Shopping findOne(int id_Shopping);
    List<Shopping> findAll();
}
