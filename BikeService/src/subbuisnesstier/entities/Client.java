package subbuisnesstier.entities;

import subbuisnesstier.Factory;
import java.util.ArrayList;
import java.util.Objects;

public class Client {

    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<Service> services = new ArrayList<>();

    public Client(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Service searchService(Service s) {
        int idx;
        if ((idx = services.indexOf(s)) != -1) {
            s = services.get(idx);
            return s;
        }
        return null;
    }

    public Service searchService(String dataService[], ServiceType type) {
        Service help1, serviceExists;
        Factory fabryka = new Factory();
        help1 = fabryka.createService(dataService, type);
        if ((serviceExists = searchService(help1)) != null) {
            return serviceExists;
        } else {
            return null;
        }
    }

    public String addService(String data[], ServiceType serviceType) {
        Factory factory = new Factory();
        Service service = factory.createService(data, serviceType);
        service.setClient(this);
        if (searchService(service) == null) {
            serviceType.addServices(service);
            services.add(service);
            return service.toString();
        } else {
            return "taki serwis juďż˝ istnieje!";
        }
    }

    public String addEquipmentToService(String dataService[], ServiceType type, Equipment equipment) {
        Service existService;
        Factory factory = new Factory();
        Service service = factory.createService(dataService, type);
        service.setClient(this);
        if ((existService = searchService(service)) != null) {
            return existService.addEquipment(equipment);
        } else {
            return "nie istnieje taki serwis";
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
        final Client other = (Client) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.firstName);
        hash = 47 * hash + Objects.hashCode(this.lastName);
        hash = 47 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public String toString() {
        return "Client{" + "firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", services=" + services + '}';
    }

}
