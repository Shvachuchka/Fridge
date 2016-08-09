package ua.lviv.lgs.services.implementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.entity.Refrigerator;
import ua.lviv.lgs.repository.RefrigeratorRepo;
import ua.lviv.lgs.services.RefrigeratorService;

import java.util.List;

@Service
public class RefrigeratorServiceImpl implements RefrigeratorService {

    @Autowired
    private RefrigeratorRepo refrigeratorRepo;

    public void addOrEdit(Refrigerator refrigerator) {
        refrigeratorRepo.save(refrigerator);
    }

    public void delete(int id_Refrigerator) {
        refrigeratorRepo.delete(id_Refrigerator);
    }

    public Refrigerator findOne(int id_Refrigerator) {
        return refrigeratorRepo.findOne(id_Refrigerator);
    }

    public List<Refrigerator> findAll() {
        return refrigeratorRepo.findAll();
    }


}