package com.SixLink;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Mortgage {
    final static byte PERCENT = 100;
    final static int month = 12;

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        float principle = (float)readInput("Principle: ", 1000, 10000000);
        float rate = (float)readInput("Annual Interest rate: ", 1, 30);
        int years = (int) readInput("Period (Years): ", 1,30);

        mortgagePrint(principle, rate, years);
    }

    private static void mortgagePrint(float principle, float rate, int years) {
        String mortgage = calculateMortgage(principle,rate,years);
        System.out.println("Monthly Mortgage: " + mortgage);
        String [] schedulePay = schedulePayments(principle,rate,years);
        System.out.println("PAYMENT SCHEDULE\n"+
                "----------------\n" + Arrays.toString(schedulePay));
    }


    public static double readInput(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while(true){
            System.out.print(prompt);
            value = scanner.nextFloat();
            if((min<=value) && (max>=value)){
                break;
            }
            System.out.println("Please enter a value between " + NumberFormat.getCurrencyInstance().format(min) + " and " + NumberFormat.getCurrencyInstance().format(max)+ ":");

        }
        return value;
    }

    public static String calculateMortgage(float principle, float rate, int years){
        float interest = rate/ PERCENT/ month;
        years = years*month;
        double mortgage =  principle*(interest*(Math.pow((1+interest),years))/(Math.pow((1+interest),years)-1));
        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);

        return mortgageFormat;
    }

    public static String[] schedulePayments (double principle, float rate, int years){
        float interest = rate/ PERCENT/ month;
        int numberOfPayments = years*month;
        String [] payResults = new String[numberOfPayments];
        for (int i = 1; i <= numberOfPayments; i++){
            double schedulePay = principle*(Math.pow((1 + interest),numberOfPayments) - Math.pow((1 + interest),i))/(Math.pow((1 + interest),numberOfPayments)-1);
            //System.out.println(schedulePay);
            String stringSchedulePay = NumberFormat.getCurrencyInstance().format(schedulePay);
            payResults[i-1] = stringSchedulePay;
        }
        return payResults;
    }
}
