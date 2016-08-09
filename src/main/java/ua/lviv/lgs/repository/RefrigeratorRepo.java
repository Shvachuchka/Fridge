package ua.lviv.lgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.lgs.entity.Refrigerator;

/**
 * Created by Sasha on 08.08.2016.
 */
public interface RefrigeratorRepo extends JpaRepository<Refrigerator, Integer>{
}
