package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.RefrigeratorDao;
import ua.lviv.lgs.entity.Refrigerator;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RefregiratorDaoImpl implements RefrigeratorDao {

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void add(Refrigerator refrigerator) {
      entityManager.persist(refrigerator);
    }

    @Transactional
    public void edit(Refrigerator refrigerator) {
    entityManager.merge(refrigerator);
    }

    @Transactional
    public void delete(Refrigerator refrigerator) {
    entityManager.remove(refrigerator);
    }

    @Transactional
    public Refrigerator findOne(int id) {
        return entityManager.find(Refrigerator.class, id);
    }

    @Transactional
    public List<Refrigerator> findAll() {
        return entityManager.createQuery("from Refrigerator ").getResultList();
    }
}
