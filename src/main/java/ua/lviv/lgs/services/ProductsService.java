package ua.lviv.lgs.services;


import ua.lviv.lgs.entity.Products;

import java.util.List;


public interface ProductsService {

    void add(String nameProducts, int Calories, byte[] fotoProducts);
    void edit(int id_Products, String nameProducts, int Calories, byte[] fotoProducts);
    void delete(int id_Products);
    Products findOne(int id_Products);
    List<Products> findAll();
}
