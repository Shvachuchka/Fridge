package ua.lviv.lgs.dao;

import ua.lviv.lgs.entity.Category;

import java.util.List;

/**
 * Created by Sasha on 15.07.2016.
 */
public interface CategoryDao {
    void add(Category category);
    void edit(Category category);
    void delete(Category category);
    Category findOne(int id);
    List<Category> findAll();
}
