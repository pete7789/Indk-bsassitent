package Nutrition;

import java.util.Scanner;

import static java.lang.System.out;

public class kcalcalcu {
   private double Height;
   private double Weight;
   private double BMI;
   private double kcalcal;

    public int getPersonalInfo;{
    out.println("Input Height in meters");
    Scanner sc = new Scanner(System.in);
        Height = sc.nextDouble();
    out.println("Input weight in kilos");
        Weight = sc.nextDouble();
    out.println("Your height is " + Height + "and your weight is " + Weight);
    }

    private int calBMI;{
        double square = Height*Height;
        BMI = Weight/square;
    }

    public int checkBMI;{
        if (BMI < 30){
            kcalcal = Weight * 25;
        }
        else {
            kcalcal = Weight * 30;
        }
    }
    private int printInfo;{
        System.out.println("Your calculated kcal pr day is"+ kcalcal);
    }
}
