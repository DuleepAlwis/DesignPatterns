package com.designpatterns.FactoryDesignPattern;

public class DAOFactoryProducer {

    public static DAOFactory getFactory(String databaseType) {
        if (databaseType.equalsIgnoreCase("MYSQL")) {
            return new MysqlDaoFactory();
        } else if (databaseType.equalsIgnoreCase("POSTGRESQL")) {
            return new PostgreDaoFactory();
        }
        throw new IllegalArgumentException("Unsupported database type");
    }
}