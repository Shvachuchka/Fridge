package ua.lviv.lgs.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.dao.CategoryDao;
import ua.lviv.lgs.entity.Category;
import ua.lviv.lgs.services.CategoryService;


import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryDao categoryDao;


    public void add(String name_Category) {
        Category category = new Category();
        category.setName_Category(name_Category);
        categoryDao.add(category);

    }


    public void edit(int id_Category, String name_Category) {
        Category category = categoryDao.findOne(id_Category);
        if( name_Category !=null)
            category.setName_Category(name_Category);
        categoryDao.edit(category);
    }

    public void delete(int id_Category) {
        Category category = categoryDao.findOne(id_Category);
        categoryDao.delete(category);
    }

    public Category findOne(int id_Category) {
        return categoryDao.findOne(id_Category);
    }


    public List<Category> findAll() {
        return categoryDao.findAll();
    }
}
