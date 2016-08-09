package ua.lviv.lgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.lgs.entity.Category;

import java.util.Locale;

/**
 * Created by Sasha on 08.08.2016.
 */
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
