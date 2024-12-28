package com.designpatterns.FacadeDesignPattern;

public class EmailServiceImpl implements CommonService<EmailDTO>{
    @Override
    public String process(EmailDTO dto) {
        return "Email id="+dto.getId()+" email="+dto.getEmail();
    }
}
