package ua.lviv.lgs.services.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.entity.Recipe;
import ua.lviv.lgs.repository.RecipeRepo;
import ua.lviv.lgs.services.RecipeService;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepo recipeRepo;

    public void addOrEdit(Recipe recipe) {
        recipeRepo.save(recipe);
    }

    public void delete(int id_Recipe) {
        recipeRepo.delete(id_Recipe);
    }

    public Recipe findOne(int id_Recipe) {
        return recipeRepo.findOne(id_Recipe);
    }

    public List<Recipe> findAll() {
        return recipeRepo.findAll();
    }
}



