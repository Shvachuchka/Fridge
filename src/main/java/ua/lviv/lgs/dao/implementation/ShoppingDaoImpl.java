package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.ShoppingDao;
import ua.lviv.lgs.entity.Shopping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Sasha on 15.07.2016.
 */@Repository
public class ShoppingDaoImpl implements ShoppingDao{

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void add(Shopping shopping) {
        entityManager.persist(shopping);
    }

    @Transactional
    public void edit(Shopping shopping) {
    entityManager.merge(shopping);
    }

    @Transactional
    public void delete(Shopping shopping) {
    entityManager.remove(shopping);
    }

    @Transactional
    public Shopping findOne(int id) {
        return entityManager.find(Shopping.class, id);
    }

    @Transactional
    public List<Shopping> findAll() {
        return entityManager.createQuery("from Shopping ").getResultList();
    }
}
