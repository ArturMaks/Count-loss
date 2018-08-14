package com.arturmaks.stock_loss.api;

public class StockLossCalculationImpl implements StockCalculation{
    
    public int calculateStockInvestment(int[] stockValues) {
        int max = stockValues[0];
        int pLoss = 0;

        for (int i = 0; i < stockValues.length; i++) {
            if (stockValues[i] > max) {
                max = stockValues[i];
            } else {
                int potentialLoss = stockValues[i] - max;
                if (potentialLoss < pLoss) {
                    pLoss = potentialLoss;
                }
            }
        }
        return pLoss;
    }
}
