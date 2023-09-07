package entities;

import entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;

    private final List<OrderItem> items = new ArrayList<>();
    private static final DateTimeFormatter orderFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");


    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        Double total = 0.0;
        for(OrderItem item: items){
            total += item.subTotal();
        }
        return total;
    }

    public void setStatus(OrderStatus status){
        this.status = status;
    }

    public static DateTimeFormatter getOrderFmt(){
        return orderFmt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        sb.append(String.format("Order moment: %s%n",moment.format(orderFmt)));
        sb.append(String.format("Order status: %s%n",status.name()));
        sb.append(String.format("Client: %s (%s) - %s%n",client.getName(),client.getBirthday().format(Client.getBirthDayFmt()), client.getEmail()));
        sb.append("Order items: \n");
        for(OrderItem orderItem : items){
            sb.append(orderItem.toString()).append("\n");
        }
        sb.append(String.format("Total price: $%.2f",total()));

        return sb.toString();
    }
}
