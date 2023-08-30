package OOB;

import entities.Order;
import entitites.enums.OrderStatus;
import java.util.Date;

public class OrderMenuEnum {
    public static void main(String[] args) {
        Order order = new Order(1080,new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus newOrderStat = OrderStatus.valueOf("DELIVERED");
        OrderStatus newOrderStat2 = OrderStatus.DELIVERED;

        order.setStatus(newOrderStat);

        System.out.println(order);

        System.out.println(newOrderStat == newOrderStat2);

        System.out.println(order.getStatus().getIndex());
    }
}
