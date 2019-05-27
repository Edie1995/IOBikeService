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
public class Test_addEquipmentToService extends ColumnFixture {

    int number;
    String dataclient[], dataservicetype[], datainservice[],  equipmentData[],data, result;

    public boolean addEquipmentToService_() {
       
        result = null;
        result = SetUp.facade.addEquipmentToService(dataclient, dataservicetype,datainservice,equipmentData);
        data = SetUp.data.outputMessages[number];
        return data.equals(result);
    }
}

