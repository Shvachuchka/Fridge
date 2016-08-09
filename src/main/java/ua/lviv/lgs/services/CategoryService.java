package ua.lviv.lgs.services;

import ua.lviv.lgs.entity.Category;

import java.util.List;


public interface CategoryService {

    void addOrEdid(Category category);
    void delete(int id_Category);
    Category findOne(int id_Category);
    List<Category> findAll();
}
