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
public class Test_addEquipmentToOrder extends ColumnFixture {

    String equipmentData[],orderData[], data, result;
    int number;

    public boolean addEquipmentToOrder_() {

        result = null;
        result = SetUp.facade.addEquipmentToOrder(orderData,equipmentData);
        data = SetUp.data.outputMessages[number];
        return data.equals(result);
    }

}
