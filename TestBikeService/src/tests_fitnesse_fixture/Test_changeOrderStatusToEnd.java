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
public class Test_changeOrderStatusToEnd  extends ColumnFixture {
    String orderData[], data, result;
    int number;

    public boolean changedOrderStatusToEnd_() {

        result = null;
        result = SetUp.facade.changeOrderStatusToEnd(orderData);
        data = SetUp.data.outputMessages[number];
        return data.equals(result);
    }  
}
