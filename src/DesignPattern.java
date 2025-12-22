import com.designpatterns.FacadeDesignPattern.EmailServiceImpl;
import com.designpatterns.FacadeDesignPattern.OrderFacade;
import com.designpatterns.FacadeDesignPattern.OrderServiceImpl;
import com.designpatterns.FacadeDesignPattern.PaymentServiceImpl;
import com.designpatterns.FactoryDesignPattern.DAOFactory;
import com.designpatterns.FactoryDesignPattern.DAOFactoryProducer;
import com.designpatterns.FactoryDesignPattern.UserEntity;
import com.designpatterns.StrategyDesignPattern.Context;
import com.designpatterns.StrategyDesignPattern.EmailService;
import com.designpatterns.StrategyDesignPattern.SMSService;

import java.util.List;

public class DesignPattern {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        factoryDesignPattern();
        facadeDesignPattern();
        strategyDesignPattern();
    }

    public static void factoryDesignPattern(){
        System.out.println("======Factory Design pattern=======");
        DAOFactory daoFactory = DAOFactoryProducer.getFactory("MYSQL");
        List<UserEntity> uem = daoFactory.getUserDAO().getAllUsers();
        uem.forEach(i->
                System.out.println(i.getId()+"-"+i.getName())
        );
        System.out.println("User "+daoFactory.getUserDAO().getUserName(1));
        System.out.println("==============MYSQL===========================");

         daoFactory = DAOFactoryProducer.getFactory("POSTGRESQL");
        List<UserEntity> uep = daoFactory.getUserDAO().getAllUsers();
        uep.forEach(i->
                System.out.println(i.getId()+"-"+i.getName())
        );
        System.out.println("User "+daoFactory.getUserDAO().getUserName(1));
        System.out.println("==============POSTGRESQL===========================");

       // daoFactory = DAOFactoryProducer.getFactory("ORACLE");

    }

    public static void facadeDesignPattern(){

        System.out.println("=========Facade Design Pattern=================");
        String orderName = "Bed";
        double amount = 5000;
        String email = "test@gmail.com";

        OrderFacade orderFacade = new OrderFacade(new EmailServiceImpl(),new OrderServiceImpl(),new PaymentServiceImpl());
        orderFacade.placeOrder(orderName,amount,email);
    }

    public static void strategyDesignPattern(){

        System.out.println("======Strategy Design pattern=======");

        String toEmail = "kasun@gmail.com";
        String messageEmail = "Notification is an email";

        Context context = new Context(new EmailService());
        context.sendNotification(toEmail,messageEmail);
        System.out.println("=============================");

        String smsNumber = "0712346789";
        String messageSms = "Notification is a sms";

        Context context1 = new Context(new SMSService());
        context1.sendNotification(smsNumber,messageSms);
    }
}