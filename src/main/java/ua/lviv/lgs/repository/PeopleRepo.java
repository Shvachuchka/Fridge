package ua.lviv.lgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.lviv.lgs.entity.People;

/**
 * Created by Sasha on 08.08.2016.
 */
public interface PeopleRepo extends JpaRepository<People, Integer> {

    @Query("SELECT u FROM People u WHERE u.email LIKE :login OR u.phone LIKE :login")
    People findByLogin(@Param("login") String login);

}
