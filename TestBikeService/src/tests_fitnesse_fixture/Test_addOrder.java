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
public class Test_addOrder extends ColumnFixture {

    String orderData[], data, result;
    int number;

    public boolean addOrder_() {

        result = null;
        result = SetUp.facade.addOrder(orderData);
        data = SetUp.data.dataorder[number];
        return data.equals(result);
    }

}