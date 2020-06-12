package com.SixLink;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float principle = (float)readInput("Principle: ", 1000, 10000000);
        float rate = (float)readInput("Annual Interest rate: ", 1, 30);
        int years = (int) readInput("Period (Years): ", 1,30);



        String mortgage = calculateMortgage(principle,rate,years);

        System.out.println("Monthly Mortgage: " + mortgage);
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
        final byte PERCENT = 100;
        final int month = 12;

        float interest = rate/ PERCENT/ month;
        years = years*month;
        double mortgage =  principle*(interest*(Math.pow((1+interest),years))/(Math.pow((1+interest),years)-1));
        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        return mortgageFormat;
    }
}
