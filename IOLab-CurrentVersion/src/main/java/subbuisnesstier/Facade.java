package subbuisnesstier;

import subbuisnesstier.entities.*;

import java.util.ArrayList;
import java.util.List;

public class Facade {

    private final List<Client> clients = new ArrayList<>();
    private final List<Order> orders = new ArrayList<>();
    private final ArrayList<ServiceType> servicesTypes = new ArrayList<>();
    private final ArrayList<Equipment> equipments = new ArrayList();

    public ArrayList<Equipment> getEquipments() {
        return equipments;
    }

    public ArrayList<ServiceType> getServicesTypes() {
        return servicesTypes;
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public Client searchClient(Client e) {
        int idx;
        if ((idx = clients.indexOf(e)) != -1) {
            e = clients.get(idx);
            return e;
        }
        return null;
    }

    public String addClient(String[] data) {
        Factory factory = new Factory();
        Client client1 = factory.createClient(data);
        if (searchClient(client1) == null) {
            clients.add(client1);
            return client1.toString();
        } else {
            return "taki klient ju� istnieje";
        }
    }

    public Client searchClient(String data[]) {
        Client help1, clientExists;
        Factory fabryka = new Factory();
        help1 = fabryka.createClient(data);
        if ((clientExists = Facade.this.searchClient(help1)) != null) {
            return clientExists;
        }
        return null;
    }

    public Order searchOrders(Order e) {
        int idx;
        if ((idx = orders.indexOf(e)) != -1) {
            e = orders.get(idx);
            return e;
        }
        return null;
    }

    public String addEquipment(String[] data) {
        Factory factory = new Factory();
        Equipment equipment = factory.createNewEquipment(data);
        if (searchEquipment(equipment) == null) {
            equipments.add(equipment);
            return equipment.toString();
        } else {
            return "istnieje ju� taki produkt";
        }
    }

    public String addOrder(String[] data) {
        Factory factory = new Factory();
        Order order1 = factory.createOrder(data);
        if (searchOrders(order1) == null) {
            orders.add(order1);
            return order1.toString();
        } else {
            return "istnieje ju� takie zam�wienie";
        }
    }

    public ServiceType searchType(ServiceType type) {
        int idx;
        if ((idx = servicesTypes.indexOf(type)) != -1) {
            type = servicesTypes.get(idx);
            return type;
        }
        return null;
    }

    public String addServiceType(String[] data) {
        Factory factory = new Factory();
        ServiceType type = factory.createServiceType(data);
        if (searchType(type) == null) {
            servicesTypes.add(type);
            return type.toString();
        } else {
            return "taki typ serwisu jest ju� w bazie";
        }
    }

    public String changeOrderStatusToEnd(String dataOrder[]) {
        Factory factory = new Factory();
        Order order, existOrder;
        order = factory.createOrder(dataOrder);
        if ((existOrder = Facade.this.searchOrders(order)) != null) {
            existOrder.changeOrderStatusToEnd();
            return "Zakonczono zamowienie";
        } else {
            return "Nie ma takiego zamowienia";
        }
    }

    public String addService(String[] dataClient, String[] dataServiceType, String[] dataService) {
        Factory factory = new Factory();
        Client client, existClient;
        client = factory.createClient(dataClient);
        if ((existClient = Facade.this.searchClient(client)) != null) {
            ServiceType type = factory.createServiceType(dataServiceType), existtype;
            if ((existtype = Facade.this.searchType(type)) != null) {
                return existClient.addService(dataService, existtype);
            }
            return "nie ma takiego typu!";
        }
        return "nie ma takiego klienta!";
    }

    public Equipment searchEquipment(String dataEqupiment[]) {
        Equipment help1, equipmentExists;
        Factory fabryka = new Factory();
        help1 = fabryka.createNewEquipment(dataEqupiment);
        if ((equipmentExists = Facade.this.searchEquipment(help1)) != null) {
            return equipmentExists;
        } else {
            return null;
        }
    }

    public String checkAvailability(String dataEqupiment[]) {
        Equipment equipment;
        if ((equipment = searchEquipment(dataEqupiment)) != null) {
            if (equipment.checkAvaliable()) {
                return equipment.toString();
            } else {
                return "Brak dostepnych narzedzi. Zloz zamowienie.";
            }
        } else {
            return "Nie istnieje takie wyposazenie";
        }
    }

    public Equipment searchEquipment(Equipment equipment) {
        int idx;
        if ((idx = equipments.indexOf(equipment)) != -1) {
            equipment = equipments.get(idx);
            return equipment;
        }
        return null;
    }

    public Equipment searchFreeEquipment(Equipment equipment) {
        Equipment existEquipment;
        if ((existEquipment = searchEquipment(equipment)) != null) {
            if (existEquipment.checkAvaliable()) {
                return existEquipment;
            }
        }
        return null;
    }

    public String addEquipmentToService(String[] dataClient, String[] dataServiceType, String[] dataService, String dataEquipment[]) {
        Factory factory = new Factory();
        Client client, existClient;
        client = factory.createClient(dataClient);
        if ((existClient = Facade.this.searchClient(client)) != null) {
            ServiceType type, existType;
            type = factory.createServiceType(dataServiceType);
            if ((existType = Facade.this.searchType(type)) != null) {
                Equipment equipment, existEquipment;
                equipment = factory.createNewEquipment(dataEquipment);
                if ((existEquipment = searchFreeEquipment(equipment)) != null) {

                    return existClient.addEquipmentToService(dataService, existType, existEquipment);
                }
                return "Nie ma takiego wyposazenia";

            } else {
                return "nie ma takiego typu!";
            }
        } else {
            return "nie ma takiego klienta!";
        }
    }

    public String addEquipmentToOrder(String dataOrder[], String dataEquipment[]) {
        Factory factory = new Factory();
        Equipment equipment, existEquipment;
        Order existOrder, order;
        order = factory.createOrder(dataOrder);
        if ((existOrder = Facade.this.searchOrders(order)) != null) {
            equipment = factory.createNewEquipment(dataEquipment);
            if ((existEquipment = searchEquipment(equipment)) != null) {
                return existOrder.addEquipment(existEquipment, Integer.valueOf(dataEquipment[2]));
            } else {
                return "Nie ma takiego produktu";
            }
        } else {
            return "Nie ma takiego zamowienia";
        }
    }

    public void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

}
