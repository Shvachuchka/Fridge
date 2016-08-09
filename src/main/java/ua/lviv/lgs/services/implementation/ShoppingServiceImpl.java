package ua.lviv.lgs.services.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.entity.Shopping;
import ua.lviv.lgs.repository.ShoppingRepo;
import ua.lviv.lgs.services.ShoppingService;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {

    @Autowired
    private ShoppingRepo shoppingRepo;

    public void addOrEdit(Shopping shopping) {
        shoppingRepo.save(shopping);
    }

    public void delete(int id_Shopping) {
        shoppingRepo.delete(id_Shopping);
    }

    public Shopping findOne(int id_Shopping) {
        return shoppingRepo.findOne(id_Shopping);
    }

    public List<Shopping> findAll() {
        return shoppingRepo.findAll();
    }

}