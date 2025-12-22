package com.designpatterns.FacadeDesignPattern;

public interface CommonService<T> {

    String process(T dto);
}
