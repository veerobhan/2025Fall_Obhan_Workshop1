package org.example;

import java.util.Scanner;

public class Calculator3
{
    public static void main(String[] args)
    {
        double monthlyPayout;
        double interestRate;
        double monthlyRate;
        double presentValue;
        int years;
        int months;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the monthly payout: $");
        monthlyPayout = scan.nextDouble();

        System.out.print("Enter the expected annual interest rate: %");
        interestRate = scan.nextDouble();

        System.out.print("Enter the number of years: ");
        years = scan.nextInt();

        monthlyRate = (interestRate / 100) / 12;
        months = years * 12;

        presentValue = monthlyPayout * (1 - Math.pow(1 + monthlyRate, -months)) / monthlyRate;

        System.out.printf("You would need to invest $%.2f%n", presentValue);
    }
}
