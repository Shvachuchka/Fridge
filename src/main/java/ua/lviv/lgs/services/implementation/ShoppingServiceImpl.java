package ua.lviv.lgs.services.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.dao.ShoppingDao;
import ua.lviv.lgs.entity.Shopping;
import ua.lviv.lgs.services.ShoppingService;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService{

    @Autowired
    private ShoppingDao shoppingDao;

    public void add(int quantity_Shopping) {
        Shopping shopping = new Shopping();
        shopping.setQuantity_Shopping(quantity_Shopping);
        shoppingDao.add(shopping);

    }

    public void edit(int id_Shopping, int quantity_Shopping) {
        Shopping shopping = shoppingDao.findOne(id_Shopping);
        shoppingDao.edit(shopping);

    }

    public void delete(int id_Shopping) {
        Shopping shopping = shoppingDao.findOne(id_Shopping);
        shoppingDao.delete(shopping);

    }

    public Shopping findOne(int id_Shopping) {
        return shoppingDao.findOne(id_Shopping);
    }

    public List<Shopping> findAll() {
        return shoppingDao.findAll();
    }
}
