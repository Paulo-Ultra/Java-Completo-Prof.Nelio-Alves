package enums.application;

import enums.entities.Order;
import enums.entities.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        //O padrão do java é que imprima o enum em forma de String do mesmo nome do ENUM
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
