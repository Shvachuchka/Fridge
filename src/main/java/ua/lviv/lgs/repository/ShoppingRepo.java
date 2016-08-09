package ua.lviv.lgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.lgs.entity.Shopping;


public interface ShoppingRepo extends JpaRepository <Shopping, Integer> {
}
