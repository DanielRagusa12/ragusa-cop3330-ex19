package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class App
{
    public static void main(String[] args)
    {
        int weight;
        int height;
        double bmi;
        String answer;
        Scanner input = new Scanner(System.in);

        System.out.print("Weight: ");
        weight = input.nextInt();


        System.out.print("Height: ");
        height = input.nextInt();


        bmi=(double)weight/((double)height*(double)height);
        bmi=bmi*703;

        BigDecimal rounding = new BigDecimal(bmi).setScale(1, RoundingMode.HALF_UP);
        bmi = rounding.doubleValue();

        System.out.print("Your BMI is "+(bmi)+"."+"\n");

        if(bmi>=18.5 && bmi<=25)
        {
            System.out.print("You are within the ideal weight range.");
        }

        if(bmi>25)
        {
            System.out.print("You are overweight. You should see your doctor.");
        }

        else if(bmi<18.5)
        {
            System.out.print("You are underweight. You should see your doctor.");
        }


    }

}