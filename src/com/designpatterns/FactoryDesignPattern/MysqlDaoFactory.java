package com.designpatterns.FactoryDesignPattern;

public class MysqlDaoFactory implements DAOFactory{

    @Override
    public UserDAO getUserDAO() {
        return new MysqlUserDao();
    }

    @Override
    public ProductDAO getProductDAO() {
        return new MysqlProductDao();
    }

    private void test(){
        System.out.println("Test");
    }
}
