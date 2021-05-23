package ru.krjava.event_agency.domain;
import lombok.Data;


@Data
public class OrderForm {
    private long id;
    private String prad;
    private String ved;
    private String request;
    private String notification;

    private long userid;

    public Order toOrder(User user){
        Order order = new Order();
        order.setPrad(prad);
        order.setVed(ved);
        order.setRequest(request);
        order.setNotification(notification);

        order.setUserid(user.getId());
        return order;
    }
}