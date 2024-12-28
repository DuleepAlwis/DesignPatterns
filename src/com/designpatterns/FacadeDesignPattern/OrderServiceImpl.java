package com.designpatterns.FacadeDesignPattern;

public class OrderServiceImpl implements CommonService<OrderDTO>{

    @Override
    public String process(OrderDTO dto) {

        return "Order id="+dto.getId()+" name="+dto.getName();
    }
}
