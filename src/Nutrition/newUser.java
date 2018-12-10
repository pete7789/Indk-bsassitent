package Nutrition;


import java.util.ArrayList;
import java.util.Scanner;


public class newUser {


    public ArrayList infoNewUser; {
        
        Scanner sc = new Scanner(System.in);
        String arrayOfNewUser[] = new String[10];

        System.out.println("Enter your name: ");
        arrayOfNewUser[0] = sc.nextLine();

        System.out.println("Enter your age: ");
        arrayOfNewUser[1] = sc.nextLine();

        arrayOfNewUser[2] = "2300"; //salt
        arrayOfNewUser[3] = "51"; //protein
        arrayOfNewUser[4] = "130"; //carbohydrates
        arrayOfNewUser[5] = "31,25"; //sugar
        arrayOfNewUser[6] = "60,5"; //fat
        arrayOfNewUser[7] = "22"; //Saturated fat

        System.out.println("Registered name is: " + arrayOfNewUser[0]);
        System.out.println("Registered age is: " + arrayOfNewUser[1]);
        kcalcalcu newuser = new kcalcalcu();
        arrayOfNewUser[8] = String.valueOf(newuser.kcalcal);
        arrayOfNewUser[9] = String.valueOf(newuser.kcalToKj);
        System.out.println("Your calculated recommended kJ pr day is: " + arrayOfNewUser[9]);


    }

}