package ua.lviv.lgs.services.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.dao.RecipeDao;
import ua.lviv.lgs.entity.Recipe;
import ua.lviv.lgs.services.RecipeService;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService{

    @Autowired
    private RecipeDao recipeDao;

    public void add(String nameRecipe, String categoryRecipe, int time_cooking, int number_products) {
        Recipe recipe = new Recipe();
        recipe.setNameRecipe(nameRecipe);
        recipe.setCategoryRecipe(categoryRecipe);
        recipe.setTime_cooking(time_cooking);
        recipe.setNumber_products(number_products);
        recipeDao.add(recipe);

    }

    public void edit(int id_Recipe, String nameRecipe, String categoryRecipe, int time_cooking, int number_products) {
        Recipe recipe = recipeDao.findOne(id_Recipe);
        if (nameRecipe != null)
            recipe.setNameRecipe(nameRecipe);
        if (categoryRecipe != null)
            recipe.setCategoryRecipe(categoryRecipe);
       recipeDao.edit(recipe);

    }

    public void delete(int id_Recipe) {
        Recipe recipe = recipeDao.findOne(id_Recipe);
        recipeDao.delete(recipe);

    }

    public Recipe findOne(int id_Recipe) {
        return recipeDao.findOne(id_Recipe);
    }

    public List<Recipe> findAll() {
        return recipeDao.findAll();
    }
}
