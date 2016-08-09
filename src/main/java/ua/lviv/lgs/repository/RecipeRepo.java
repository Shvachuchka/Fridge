package ua.lviv.lgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.lgs.entity.Recipe;

/**
 * Created by Sasha on 08.08.2016.
 */
public interface RecipeRepo extends JpaRepository<Recipe, Integer>{
}
