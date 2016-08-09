package ua.lviv.lgs.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.entity.Category;
import ua.lviv.lgs.repository.CategoryRepo;
import ua.lviv.lgs.services.CategoryService;


import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public void addOrEdid(Category category) {
        categoryRepo.save(category);
    }

    public void delete(int id_Category) {
        categoryRepo.delete(id_Category);
    }

    public Category findOne(int id_Category) {
        return categoryRepo.findOne(id_Category);
    }

    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

}


