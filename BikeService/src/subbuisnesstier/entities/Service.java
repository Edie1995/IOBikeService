package subbuisnesstier.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Service {

    private String name;
    private Status status;
    private LocalDate endTime;
    private ServiceType serviceType;
    private Client client;
    private final List<String> equipmentsString = new ArrayList<>();
    private final List<Equipment> equipments = new ArrayList<>();

    public Service() {
    }

    public Service(String name, String endTime, ServiceType serviceType) {
        this.name = name;
        this.status = Status.PRZYJETE;
        this.endTime = LocalDate.now().plusDays(serviceType.getDefaultEndTime()).plusDays(Integer.parseInt(endTime));
        this.serviceType = serviceType;
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

    public void setStatus() {
        this.status = Status.PRZYJETE;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {

        this.endTime = LocalDate.now().plusDays(serviceType.getDefaultEndTime()).plusDays(endTime);

    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    public void changeStatus(Status status) {
        this.status = status;

    }

    public String addEquipment(Equipment equipment) {

        equipments.add(equipment);
        equipmentsString.add(equipment._toString());
        return "3";

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
        final Service other = (Service) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.serviceType, other.serviceType)) {
            return false;
        }
        if (!Objects.equals(this.client, other.client)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.serviceType);
        hash = 89 * hash + Objects.hashCode(this.client);
        return hash;
    }

    @Override
    public String toString() {
        return "Service{" + "name=" + name + ", status=" + status + ", endTime=" + endTime + ", serviceType=" + serviceType.getName() + ",equipments" + equipmentsString.toString()+'}';
    }

}
