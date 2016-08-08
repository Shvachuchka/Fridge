package ua.lviv.lgs.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.dao.PeopleDao;
import ua.lviv.lgs.entity.People;
import ua.lviv.lgs.services.PeopleService;

import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleDao peopleDao;

    public void add(String namePeople, String surname, String password) {
        People people = new People();
        people.setNamePeople(namePeople);
        people.setSurname(surname);
        people.setPassword(password);

        peopleDao.add(people);
    }

   public void edit(People people){
       peopleDao.edit(people);
   }

    public void delete(int id_People) {
        People people = peopleDao.findOne(id_People);
        peopleDao.delete(people);
    }

    public void add(People people) {
        peopleDao.add(people);
    }

    public People findOne(int id_People) {
        return peopleDao.findOne(id_People);
    }




    public List<People> findAll() {
        return peopleDao.findAll();
    }
}
