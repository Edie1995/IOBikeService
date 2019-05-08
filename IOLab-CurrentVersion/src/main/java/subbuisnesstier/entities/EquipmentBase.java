/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subbuisnesstier.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import subbuisnesstier.Factory;

/**
 *
 * @author kruko
 */
public class EquipmentBase {

    private Equipment equipment;

    private List<Equipment> equipments = new ArrayList<>();
  
    public List<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<Equipment> equipments) {
        this.equipments = equipments;
    }

    public Equipment searchEquipment(Equipment e) {
        int idx;
        if ((idx = equipments.indexOf(e)) != -1) {
            e = equipments.get(idx);
            return e;
        }
        return null;
    }

    public void addEquipment(String[] data) {
        Factory factory = new Factory();
        Equipment equipment1 = factory.createNewEquipment(data);
        if (searchEquipment(equipment1) == null) {
            equipments.add(equipment1);
        }

    }

    public void removeEquipment(String[] data) {
        Factory factory = new Factory();
        Equipment equipment1 = factory.createNewEquipment(data);
        equipments.remove(equipment1);

    }

}
