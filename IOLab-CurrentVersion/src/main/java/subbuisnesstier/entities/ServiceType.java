package subbuisnesstier.entities;

import java.util.ArrayList;
import java.util.Objects;

public class ServiceType {

    private String name;
    private int defaultEndTime;
    private ArrayList <Service> services = new ArrayList<>();

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }
    
    public void addServices(Service service){
        services.add(service);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDefaultEndTime(int defaultDurationTime) {
        this.defaultEndTime = defaultDurationTime;

    }

    public int getDefaultEndTime() {
        return defaultEndTime;
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
        final ServiceType other = (ServiceType) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.defaultEndTime, other.defaultEndTime)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + this.defaultEndTime;
        return hash;
    }

    @Override
    public String toString() {
        return "ServiceType{" + "name=" + name + ", defaultEndTime=" + defaultEndTime + ", services=" + services + '}';
    }

   

   
}
