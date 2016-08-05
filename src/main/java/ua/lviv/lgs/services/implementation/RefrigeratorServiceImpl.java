package ua.lviv.lgs.services.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.dao.RefrigeratorDao;
import ua.lviv.lgs.entity.Refrigerator;
import ua.lviv.lgs.services.RefrigeratorService;

import java.util.List;

@Service
public class RefrigeratorServiceImpl implements RefrigeratorService{

    @Autowired
    private RefrigeratorDao refrigeratorDao;

    public void add(String address_Refrigerator) {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setAddress_Refrigerator(address_Refrigerator);
        refrigeratorDao.add(refrigerator);

    }

    public void edit(int id_Refrigerator, String address_Refrigerator) {
        Refrigerator refrigerator = refrigeratorDao.findOne(id_Refrigerator);
        refrigeratorDao.edit(refrigerator);

    }

    public void delete(int id_Refrigerator) {
        Refrigerator refrigerator = refrigeratorDao.findOne(id_Refrigerator);
        refrigeratorDao.delete(refrigerator);

    }

    public Refrigerator findOne(int id_Refrigerator) {
        return refrigeratorDao.findOne(id_Refrigerator);
    }

    public List<Refrigerator> findAll() {
        return refrigeratorDao.findAll();
    }
}
