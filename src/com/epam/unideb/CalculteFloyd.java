package com.epam.unideb;

import java.io.IOException;
import java.util.ArrayList;

public class CalculteFloyd {
    public void triangle(int N) throws IOException {
        WriteFile data = new WriteFile("Floyd.txt");
        ArrayList<Integer> dataArrayList = new ArrayList<>();
        int currentNumber = 1;
        int rows = 1;
        int breakLine = 1;
        while (rows <= N) {
            dataArrayList.add(currentNumber);
            if (breakLine == rows) {
                dataArrayList.add(0);
                if(rows == N) {
                    System.out.print(currentNumber);
                } else {
                    System.out.println(currentNumber);
                }
                currentNumber++;
                rows++;
                breakLine = 1;
            } else {
                System.out.print(currentNumber + " ");
                currentNumber++;
                breakLine++;
            }
        }
        data.writeToFile(dataArrayList);

        int sum = 0;

        for(int i = 0; i < dataArrayList.size(); i++) {
            if(dataArrayList.get(i) != 0) {
                sum += dataArrayList.get(i);
            }
        }
        System.out.print(" " + sum);
    }
}
