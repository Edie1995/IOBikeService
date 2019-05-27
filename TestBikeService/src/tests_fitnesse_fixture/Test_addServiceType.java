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
public class Test_addServiceType extends ColumnFixture {

    String serviceTypeData[], data, result;
    int number;

    public boolean addServiceType_() {

        result = null;
        result = SetUp.facade.addServiceType(serviceTypeData);
        data = SetUp.data.dataservicetype[number];
        return data.equals(result);
    }

}
