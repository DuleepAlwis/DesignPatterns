package com.designpatterns.FactoryDesignPattern;

public interface DAOFactory {

    UserDAO getUserDAO();
    ProductDAO getProductDAO();
}
