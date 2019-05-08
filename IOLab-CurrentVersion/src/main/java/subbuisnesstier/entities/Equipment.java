package subbuisnesstier.entities;

import java.util.Objects;

public class Equipment {

    private String name;
    private int amount;
    private int orderAmount;
    private double price;
    private Order order;

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void increaseAmountEquipment() {
        int i = this.getAmount() + this.getOrderAmount();
        setOrderAmount(0);
        setOrder(null);
        this.setAmount(i);

    }

    public void increaseOrderEquipmentAmount(int k) {
        int i = this.getOrderAmount() + k;
        this.setOrderAmount(i);
    }

    public boolean decreaseAmountEquipment() {
        if (checkAvaliable()) {
            int i = this.getAmount();
            i--;
            this.setAmount(i);
            return true; }
        return false;
    }
    public boolean checkAvaliable() {
        return (getAmount() > 0); }



    public String checkOrder(Order order) {
        if (this.getOrder() == null) {
            return "null";
        } else if (this.getOrder().equals(order)) {
            return "true";
        } else {
            return "false";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equipment other = (Equipment) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Equipment{" + "name=" + name + ", amount=" + amount + ", orderAmount=" + orderAmount + ", price=" + price +  '}';
    }

}
