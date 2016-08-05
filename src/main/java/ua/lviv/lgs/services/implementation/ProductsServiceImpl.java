package ua.lviv.lgs.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.dao.ProductsDao;
import ua.lviv.lgs.entity.Products;
import ua.lviv.lgs.services.ProductsService;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsDao productsDao;

    public void add(String nameProducts, int Calories, byte[] fotoProducts) {
        Products products = new Products();
        products.setNameProducts(nameProducts);
       products.setCalories(Calories);
        products.setFotoProducts(fotoProducts);
        productsDao.add(products);

    }

    public void edit(int id_Products, String nameProducts, int Calories, byte[] fotoProducts) {
        Products products = productsDao.findOne(id_Products);
        if (nameProducts !=null)
            products.setNameProducts(nameProducts);
       productsDao.edit(products);


    }

    public void delete(int id_Products) {
Products products = productsDao.findOne(id_Products);
        productsDao.delete(products);
    }

    public Products findOne(int id_Products) {
        return productsDao.findOne(id_Products);
    }

    public List<Products> findAll() {
        return productsDao.findAll();
    }
}
