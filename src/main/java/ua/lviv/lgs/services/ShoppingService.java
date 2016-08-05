package ua.lviv.lgs.services;


import ua.lviv.lgs.entity.Shopping;

import java.util.List;

/**
 * Created by Sasha on 15.07.2016.
 */
public interface ShoppingService {

    void add(int quantity_Shopping);
    void edit(int id_Shopping, int quantity_Shopping);
    void delete(int id_Shopping);
    Shopping findOne(int id_Shopping);
    List<Shopping> findAll();
}
