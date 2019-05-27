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
public class Test_addClient extends ColumnFixture {

    String dataclientin[], data, result;
    int number;

    public boolean addClient_() {
        result = null;
        result = SetUp.facade.addClient(dataclientin);
        data = SetUp.data.dataclients[number];
        return data.equals(result);
    }

}
