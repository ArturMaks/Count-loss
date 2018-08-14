package com.arturmaks.stock_loss.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class TxtFileReaderImpl implements FileReader {

    public int[] readFromFile() {
        Scanner scan = null;

        URL url = getClass().getClassLoader().getResource("input.txt");
        try {
            scan = new Scanner(new File(url.getPath()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int[] stockValues = new int[scan.nextInt()];
        for (int i = 0; i < stockValues.length; i++) {
            stockValues[i] = scan.nextInt();
        }
        return stockValues;
    }
}