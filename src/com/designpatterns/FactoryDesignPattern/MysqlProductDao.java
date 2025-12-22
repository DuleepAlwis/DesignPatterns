package com.designpatterns.FactoryDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MysqlProductDao implements ProductDAO{

    private static List<ProductEntity> products = new ArrayList<>();

    static {
        for(int i=0;i<5;i++){
            ProductEntity pe = new ProductEntity();
            pe.setId(i);
            pe.setName("Mysql Product "+i);
            products.add(pe);
        }
    }

    @Override
    public List<ProductEntity> getAllProducts() {
        return products;
    }

    @Override
    public ProductEntity getProductName(long id) {
        return products.stream().filter(i->i.getId()==id).findAny().orElse(null);
    }
}
