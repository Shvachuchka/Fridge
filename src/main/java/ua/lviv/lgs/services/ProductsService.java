package ua.lviv.lgs.services;


import ua.lviv.lgs.entity.Products;

import java.util.List;


public interface ProductsService {

    void addOrEdit(Products products);
    void delete(int id_Products);
    Products findOne(int id_Products);
    List<Products> findAll();
}
