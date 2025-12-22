package com.designpatterns.FactoryDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class PostgreUserDao implements UserDAO{
    private static List<UserEntity> users = new ArrayList<>();

    static {
        for(int i=0;i<5;i++){
            UserEntity ue = new UserEntity();
            ue.setId(i);
            ue.setName("Postgre User "+i);
            users.add(ue);
        }
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return users;
    }

    @Override
    public UserEntity getUserName(long id) {
        return users.stream().filter(i->i.getId()==id).findAny().orElse(null);
    }
}
