package com.designpatterns.FactoryDesignPattern;

import java.util.List;

public interface ProductDAO {

    List<ProductEntity> getAllProducts();
    ProductEntity getProductName(long id);
}
