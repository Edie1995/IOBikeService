package subbuisnesstier.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {

    private String name;
    private Status status;
    private final List<Equipment> equipments = new ArrayList<>();

    public Order() {
    }

    public Order(String name) {
        this.name = name;
        this.status = Status.PRZYJETE;
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String addEquipment(Equipment equipment, int amount) {
        if (equipment.checkOrder(null).equals("null")) {
            equipment.setOrder(this);
            equipment.increaseOrderEquipmentAmount(amount);
            equipments.add(equipment);
            return "2";
        }
        return "3";
    }

    public void changeOrderStatusToEnd() {
        this.setStatus(Status.ZAKONCZONE);
        for (Equipment e : equipments) {
            e.increaseAmountEquipment();
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
        final Order other = (Order) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public String toString() {
        return "Order{" + "name=" + name + ", status=" + status + ", equipments=" + equipments + '}';
    }

}
