package ua.lviv.lgs.dao;


import ua.lviv.lgs.entity.Recipe;

import java.util.List;


public interface RecipeDao {

    void add(Recipe recipe);
    void edit(Recipe recipe);
    void delete(Recipe recipe);
    Recipe findOne(int id);
    List<Recipe> findAll();
}
