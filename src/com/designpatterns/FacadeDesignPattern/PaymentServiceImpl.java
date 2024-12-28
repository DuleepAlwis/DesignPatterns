package com.designpatterns.FacadeDesignPattern;

public class PaymentServiceImpl implements CommonService<PaymentDTO>{
    @Override
    public String process(PaymentDTO dto) {
        return "Payment id="+dto.getId()+" price="+dto.getPrice();
    }
}
