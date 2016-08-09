package ua.lviv.lgs.services;


import ua.lviv.lgs.entity.Refrigerator;

import java.util.List;


public interface RefrigeratorService {

    void addOrEdit(Refrigerator refrigerator);
       void delete(int id_Refrigerator);
    Refrigerator findOne(int id_Refrigerator);
    List<Refrigerator> findAll();
}
