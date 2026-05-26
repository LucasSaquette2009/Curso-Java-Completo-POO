package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

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
        return orderItems;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public double total() {
        double sum = 0;

        for (OrderItem c : orderItems) {
            sum += c.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdfClient = new SimpleDateFormat("dd/MM/yyyy");

        sb.append("--------------------------\n");
        sb.append("ORDER SUMMARY\n");
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client.getName() + " ");
        sb.append("(" + sdfClient.format(client.getBirthDate()) + ") ");
        sb.append(client.getEmail() + "\n");

        sb.append("Order items:\n");
        for (OrderItem c : orderItems) {
            sb.append(c.getProduct().getName() + ", ");
            sb.append(String.format("%.2f", c.getPrice()) + ", Quantity: ");
            sb.append(c.getQuantity() + ", Subtotal: $ ");
            sb.append(String.format("%.2f", c.subTotal())+ "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
