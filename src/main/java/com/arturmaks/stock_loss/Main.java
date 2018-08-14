package com.arturmaks.stock_loss;

import com.arturmaks.stock_loss.api.FileReader;
import com.arturmaks.stock_loss.api.StockCalculation;
import com.arturmaks.stock_loss.api.StockLossCalculationImpl;
import com.arturmaks.stock_loss.api.TxtFileReaderImpl;

public class Main {

    public static void main(String[] args) {

        FileReader fileReader = new TxtFileReaderImpl();
        int[] stockValues = fileReader.readFromFile();

        StockCalculation stockCalculation = new StockLossCalculationImpl();
        int stockLoss = stockCalculation.calculateStockInvestment(stockValues);
        System.out.println("Worst stock investment is " + stockLoss);
    }

}
