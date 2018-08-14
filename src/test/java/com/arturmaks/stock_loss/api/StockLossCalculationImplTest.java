package com.arturmaks.stock_loss.api;

import org.junit.Assert;
import org.junit.Test;

public class StockLossCalculationImplTest {

    private StockLossCalculationImpl calculation = new StockLossCalculationImpl();

    @Test
    public void testCase1(){
        int[] array = {3, 2, 4, 2, 1, 5};
        int result = calculation.calculateStockInvestment(array);
        Assert.assertEquals("Should be -3", result,-3);
    }

    @Test
    public void testCase2(){
        int[] array = {5, 3, 4, 2, 3, 1};
        int result = calculation.calculateStockInvestment(array);
        Assert.assertEquals("Should be -4", result,-4);
    }

    @Test
    public void testCase3(){
        int[] array = {1, 2, 4, 4, 5};
        int result = calculation.calculateStockInvestment(array);
        Assert.assertEquals("Should be 0", result,0);
    }
}
