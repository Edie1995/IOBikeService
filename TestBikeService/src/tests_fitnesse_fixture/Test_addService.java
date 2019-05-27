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
public class Test_addService extends ColumnFixture {

    int number;
    String dataclient[], dataservicetype[], datainservice[], data, result;

    public boolean addService_() {
       
        result = null;
        result = SetUp.facade.addService(dataclient, dataservicetype,datainservice);
        data = SetUp.data.dataservice[number];
        return data.equals(result);
    }
}
