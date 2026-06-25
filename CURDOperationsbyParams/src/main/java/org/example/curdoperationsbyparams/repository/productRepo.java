package org.example.curdoperationsbyparams.repository;

import org.example.curdoperationsbyparams.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface productRepo extends JpaRepository<Product,Integer> {
    List<Product> findByQuantity(int quantity);
    //Find by yom greater than
    //List<Product> findByDescriptionYomGreaterThan(int yom);
    //
    //Equivalent:
    //
    //SELECT p  
    //FROM Product p
    //WHERE p.description.yom > :yom/
    List<Product> findByDescriptionYom(int yom);

    Product findByPname(String name);
}
