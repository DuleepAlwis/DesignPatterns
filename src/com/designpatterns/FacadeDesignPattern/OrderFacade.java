package com.designpatterns.FacadeDesignPattern;

public class OrderFacade {

    private  EmailServiceImpl emailService= null;
    private  OrderServiceImpl orderService = null;
    private  PaymentServiceImpl paymentService = null;

    public OrderFacade(final EmailServiceImpl emailService,final OrderServiceImpl orderService,final PaymentServiceImpl paymentService) {
        this.emailService = emailService;
        this.orderService = orderService;
        this.paymentService = paymentService;
    }

    public void placeOrder(String orderName,double amount,String email){
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(1);
        orderDTO.setName(orderName);
        String order = this.orderService.process(orderDTO);

        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setId(2);
        paymentDTO.setPrice(amount);

        String payment = this.paymentService.process(paymentDTO);

        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setId(3);
        emailDTO.setEmail(email);

        String emailR = this.emailService.process(emailDTO);

        System.out.println(order);
        System.out.println(payment);
        System.out.println(emailR);

    }
}
