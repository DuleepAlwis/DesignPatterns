package com.designpatterns.FactoryDesignPattern;

import java.util.List;

public interface UserDAO {

    List<UserEntity> getAllUsers();
    UserEntity getUserName(long id);
}
