package com.SixLink;

import com.sun.security.jgss.GSSUtil;

import java.text.Format;
import java.text.NumberFormat;
import java.time.Period;
import java.util.Scanner;

public class Mortgage {

    public static void main(String[] args) {
        final byte PERCENT = 100;
        float principle;
        float rate;
        final int month = 12;
        int years;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Principle: ");
            principle = scanner.nextFloat();
        }while((1000>principle) || (principle>1000000));


        //System.out.println("hahahaha "+ principle);
        do {
            System.out.print("Annual Interest rate: ");
            rate = scanner.nextFloat();

        }while ((rate<1) || (rate > 30));

        float interest = rate/ PERCENT/ month;

        do {
            System.out.print("Period (Years): ");
            years = scanner.nextInt();
        }while(years<1 || years >30);


        years = years*month;

        double mortgage =  principle*(interest*(Math.pow((1+interest),years))/(Math.pow((1+interest),years)-1));
        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);


        System.out.println("Mortgage: " + mortgageFormat);
    }
}
