package org.example;

import java.util.Scanner;

public class Calculator2
{
    public static void main(String[] args)
    {
        double deposit;
        double interestRate;
        int years;
        double futureValue;
        double interestEarned;

        Scanner scan = new Scanner(System.in);

        System.out.print("Deposit amount: $");
        deposit = scan.nextDouble();

        System.out.print("Interest rate: %");
        interestRate = scan.nextDouble();
        interestRate = interestRate / 100;

        System.out.print("Number of years: ");
        years = scan.nextInt();

        futureValue = deposit * Math.pow(1 + (interestRate / 365), 365 * years);
        interestEarned = futureValue - deposit;

        System.out.printf("CD Ending balance: $%.2f%n", futureValue);
        System.out.printf("Interest earned: $%.2f%n", interestEarned);
    }
}
