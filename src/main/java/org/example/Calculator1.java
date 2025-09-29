package org.example;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args)
    {
        double principal;
        double annualInterest;
        double monthlyInterest;
        double loanLength;
        double months;
        double numerator;
        double denominator;
        double monthlyPayment;
        double totalInterestPaid;

        Scanner scan = new Scanner(System.in);

        System.out.print("Principal: $");
        principal = scan.nextDouble();

        System.out.print("Annual interest rate: %");
        annualInterest = scan.nextDouble();
        annualInterest = annualInterest / 100;
        monthlyInterest = annualInterest / 12;

        System.out.print("Loan length (in years): ");
        loanLength = scan.nextDouble();
        months = loanLength * 12;

        numerator = (monthlyInterest * Math.pow(1 + monthlyInterest, months));
        denominator = (Math.pow(1 + monthlyInterest, months) - 1);
        monthlyPayment = principal * numerator / denominator;
        totalInterestPaid = (monthlyPayment * months) - principal;

        System.out.printf("The expected monthly payment is: $%.2f%n", monthlyPayment);
        System.out.printf("The total interest paid is: $%.2f%n", totalInterestPaid);
    }
}