package com.epam.unideb;

import java.io.IOException;
import java.util.ArrayList;

public class CalculteFloyd {
    public void triangle(int N) throws IOException {
        WriteFile data = new WriteFile("Floyd.txt", true);
        ArrayList<Integer> dataArrayList = new ArrayList<Integer>();
        int i = 1;
        int j = 1;
        int k = 1;
        while (j <= N) {
            dataArrayList.add(i);
            if (k == j) {
                dataArrayList.add(0);
                if(j == N) {
                    System.out.print(i);
                }
                else {
                    System.out.println(i);
                }
                i++;
                j++;
                k = 1;
            } else {
                System.out.print(i + " ");
                i++;
                k++;
            }
        }
        data.writeToFile(dataArrayList);

        int sum = 0;

        for(int l = 0; l < dataArrayList.size(); l++) {
            if(dataArrayList.get(l) != 0) {
                sum += dataArrayList.get(l);
            }
        }

        System.out.print(" " + sum);
    }
}
