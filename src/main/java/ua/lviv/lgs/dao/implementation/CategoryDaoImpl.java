package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.CategoryDao;
import ua.lviv.lgs.entity.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao{

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void add(Category category) {
        entityManager.persist(category);

    }

    @Transactional
    public void edit(Category category) {
    entityManager.merge(category);
    }

    @Transactional
    public void delete(Category category) {
    entityManager.remove(category);
    }

    @Transactional
    public Category findOne(int id) {
        return entityManager.find(Category.class,id);
    }

    @Transactional
    public List<Category> findAll() {
        return entityManager.createQuery("from Category ").getResultList();
    }
}
