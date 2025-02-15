package com.example.RomashkaKo.repositories;

import com.example.RomashkaKo.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends CrudRepository<Product,Integer> {
    List<Product> findAll();
    List<Product> findByNameContainingIgnoreCase(String name);
    List<Product> findByPriceLessThan(int limit);
    List<Product> findByPriceGreaterThan(int limit);

    List<Product> findByPrice(int limit);
    List<Product> findByInStock(boolean isInStock);

}
