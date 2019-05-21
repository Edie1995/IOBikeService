package subbuisnesstier;

import subbuisnesstier.entities.Order;
import subbuisnesstier.entities.Client;
import subbuisnesstier.entities.ServiceType;
import subbuisnesstier.entities.Service;
import subbuisnesstier.entities.Equipment;
import subbuisnesstier.entities.Status;

public class Factory {

    public Order createOrder(String[] data) {
        Order order = new Order();
        order.setName(data[0]);
        order.setStatus(Status.PRZYJETE);
        return order;
    }

    public Client createClient(String[] data) {
        Client client = new Client();
        client.setFirstName(data[0]);
        client.setLastName(data[1]);
        client.setEmail(data[2]);
        return client;
    }

    public Equipment createNewEquipment(String[] data) {
        Equipment equipment = new Equipment();
        equipment.setName(data[0]);
        equipment.setAmount(1);
        equipment.setPrice(Double.parseDouble(data[1]));
        return equipment;
    }

    public ServiceType createServiceType(String[] data) {
        ServiceType serviceType = new ServiceType();
        serviceType.setName(data[0]);
        serviceType.setDefaultEndTime(Integer.valueOf(data[1]));
        return serviceType;

    }

    public Service createService(String data[], ServiceType serviceType) {
        Service service = new Service();
        service.setName(data[0]);
        service.setStatus();
        service.setServiceType(serviceType);
        service.setEndTime(Integer.parseInt(data[1]));
        return service;
    }

}
