package ua.lviv.lgs.dao.implementation;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.RecipeDao;
import ua.lviv.lgs.entity.Recipe;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class RecipeDaoImpl implements RecipeDao {

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void add( Recipe recipe) {
        entityManager.persist(recipe);
    }

    @Transactional
    public void edit( Recipe recipe) {
        entityManager.merge(recipe);
    }

    @Transactional
    public void delete(Recipe recipe) {
        entityManager.remove(recipe);
    }

    @Transactional
    public Recipe findOne(int id) {
        return entityManager.find(Recipe.class,id);
    }

    @Transactional
    public List<Recipe> findAll() {
        return entityManager.createQuery("from Recipe ").getResultList();
    }
}
