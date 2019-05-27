/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests_fitnesse_fixture;

import fit.ColumnFixture;

/**
 *
 * @author Magda
 */
public class Test_addEquipment extends ColumnFixture {

    String equipmentData[], data, result;
    int number;

    public boolean addEquipment_() {

        result = null;
        result = SetUp.facade.addEquipment(equipmentData);
        data = SetUp.data.dataequipment[number];
        return data.equals(result);
    }

}
