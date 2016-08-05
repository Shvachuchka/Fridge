package ua.lviv.lgs.services;

import ua.lviv.lgs.entity.Recipe;

import java.util.List;

/**
 * Created by Sasha on 15.07.2016.
 */
public interface RecipeService {

    void add(String nameRecipe, String categoryRecipe, int time_cooking, int number_products);
    void edit(int id_Recipe, String nameRecipe, String categoryRecipe, int time_cooking, int number_products);
    void delete(int id_Recipe);
    Recipe findOne(int id_Recipe);
    List<Recipe> findAll();
}
