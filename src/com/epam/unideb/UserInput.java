package com.epam.unideb;

import java.util.Scanner;

public class UserInput {
    public int input() {

        while(true) {
            Scanner rows = new Scanner(System.in);
            try {
                System.out.print("Enter the number of rows: ");
                int amount = rows.nextInt();
                if(amount > 0) {
                    return amount;
                } else
                    System.out.println("Invalid number!");
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid number!");
            }
        }
    }
}
