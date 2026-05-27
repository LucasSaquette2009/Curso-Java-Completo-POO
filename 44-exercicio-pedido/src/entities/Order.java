package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

   static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItems() {
        return items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItems(OrderItem item) {
        items.add(item);
    }

    public void removeItems(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0;

        for (OrderItem c : items) {
            sum += c.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("--------------------------\n");
        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client);

        sb.append("Order items:\n");
        for (OrderItem item : items) {
            sb.append(item);
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
