package ua.lviv.lgs.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.entity.Products;
import ua.lviv.lgs.repository.ProductsRepo;
import ua.lviv.lgs.services.ProductsService;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsRepo productsRepo;

    public void addOrEdit(Products products) {
        productsRepo.save(products);
    }

    public void delete(int id_Products) {
        productsRepo.delete(id_Products);
    }

    public Products findOne(int id_Products) {
        return productsRepo.findOne(id_Products);
    }

    public List<Products> findAll() {
        return productsRepo.findAll();
    }

}

