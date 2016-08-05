package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.ProductsDao;
import ua.lviv.lgs.entity.Products;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ProductsDaoImpl implements ProductsDao {

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void add(Products products) {
        entityManager.persist(products);

    }

    @Transactional
    public void edit(Products products) {
    entityManager.merge(products);
    }

    @Transactional
    public void delete(Products products) {
    entityManager.remove(products);
    }

    @Transactional
    public Products findOne(int id) {
        return entityManager.find(Products.class,id);
    }

    @Transactional
    public List<Products> findAll() {
        return entityManager.createQuery("from Products ").getResultList();
    }
}
