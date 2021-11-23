package com.epam.unideb;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        UserInput userInput = new UserInput();
        CalculateFloyd calculateFloyd = new CalculateFloyd();

        int rows = userInput.input();

        calculateFloyd.triangle(rows);
    }
}
