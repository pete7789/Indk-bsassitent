package Nutrition;

import java.util.Scanner;

import static java.lang.System.out;

public class kcalcalcu {
   private double Height;
   private double Weight;
   private double BMI;
   double kcalcal;
   double kcalToKj;

    public int getPersonalInfo;{
    out.println("Input Height in meters");
    Scanner sc = new Scanner(System.in);
        Height = sc.nextDouble();
    out.println("Input weight in kilos");
        Weight = sc.nextDouble();
    out.println("Your height is " + Height + "m and your weight is " + Weight + "kg");
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

    public double kjCalcu;{
        kcalToKj = kcalcal * 4.184;
    }
    private int printInfo;{
        System.out.println("Your calculated recommended kcal pr day is: "+ kcalcal);
    }
}
