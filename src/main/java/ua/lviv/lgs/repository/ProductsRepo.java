package ua.lviv.lgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.lgs.entity.Products;

/**
 * Created by Sasha on 08.08.2016.
 */
public interface ProductsRepo extends JpaRepository<Products, Integer>{
}
