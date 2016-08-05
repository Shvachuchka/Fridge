package ua.lviv.lgs.dao.implementation;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.PeopleDao;
import ua.lviv.lgs.entity.People;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PeopleDaoImpl implements PeopleDao{

@PersistenceContext(unitName = "Main")
private EntityManager entityManager;

    @Transactional
    public void add(People people) {
    entityManager.persist(people);
    }

    @Transactional
    public void edit(People people) {
    entityManager.merge(people);
    }

    @Transactional
    public void delete(People people) {
    entityManager.remove(people);
    }

    @Transactional
    public People findOne(int id) {
        return entityManager.find(People.class,id);
    }

    @Transactional
    public List<People> findAll() {
        return entityManager.createQuery("from People ").getResultList();
    }
}
