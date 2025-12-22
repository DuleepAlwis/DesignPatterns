package com.designpatterns.FactoryDesignPattern;

public class PostgreDaoFactory implements DAOFactory{
    @Override
    public UserDAO getUserDAO() {
        return new PostgreUserDao();
    }

    @Override
    public ProductDAO getProductDAO() {
        return new PostgreProductDao();
    }
}
