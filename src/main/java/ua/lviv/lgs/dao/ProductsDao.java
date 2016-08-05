package ua.lviv.lgs.dao;



import ua.lviv.lgs.entity.Products;
import ua.lviv.lgs.entity.Products;

import java.util.List;

/**
 * Created by Sasha on 15.07.2016.
 */
public interface ProductsDao {

    void add(Products products);
    void edit(Products products);
    void delete(Products products);
    Products findOne(int id);
    List<Products> findAll();
}
