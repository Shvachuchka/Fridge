package ua.lviv.lgs.services.implementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.peopledetails.PeopleDetails;
import org.springframework.security.core.peopledetails.PeopleDetailsService;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.entity.People;
import ua.lviv.lgs.repository.PeopleRepo;
import ua.lviv.lgs.services.PeopleService;
import javax.persistence.NoResultException;
import java.nio.file.attribute.PeoplePrincipalNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService, PeopleDetailsService {

    @Autowired
    private PeopleRepo peopleRepo;

    public PeopleDetails loadPeopleByPeoplename(String login) throws PeoplePrincipalNotFoundException{
        People people;

        try {
          people=peopleRepo.findByLogin(login);
        } catch (NoResultException e) {
            return null;
        }
        Collection<SimpleGrantedAuthority>authorities = new ArrayList<SimpleGrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return new org.springframework.security.core.peopledetails.People(String.valueOf(people.getId_People()), people.getPassword(),authorities);
    }

    public void addOrEdit(People people) {
        peopleRepo.save(people);
    }

    public void delete(int id_People) {
        peopleRepo.delete(id_People);
    }

    public People findOne(int id_People) {
        return peopleRepo.findOne(id_People);
    }

    public List<People> findAll() {
        return peopleRepo.findAll();
    }
}


