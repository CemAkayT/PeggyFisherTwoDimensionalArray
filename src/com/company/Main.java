package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] prices = new double[5][2];

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter the original price: ");
            prices[i][0]= scanner.nextDouble();
            prices[i][1] = prices[i][0] * 0.75;

        }
        for (int i = 0; i < 5; i++)
        {
            System.out.println("original price $ = " + prices[i][0] +
                    "\tdiscounted price $ = " + prices[i][1]);
        }
        
    }
}
