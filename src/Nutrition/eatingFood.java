package Nutrition;

import java.util.Scanner;

public class eatingFood {

    public int addFoodOrDel;{
        System.out.println("Type [1] to add food to your list or type [2] to remove food from your list: ");
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt() == 1) {
            foodAdd();
        }
        else if (sc.nextInt() == 2){
            foodDel();
        }

    }

    String arrayOfFoodEaten[] = new String[10];


    public String foodAdd(){
        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many do you want to add?: ");
        amount = sc.nextInt();


        int i;
        for(i=0; i < amount; i++) {
            System.out.println("What food did you eat today: ");
            Scanner sc1 = new Scanner(System.in);
            arrayOfFoodEaten[i] = sc1.nextLine();
        }
        return arrayOfFoodEaten[i];
    }

    public String foodDel(){
        System.out.println("What food do you want to remove from your list: ");
        Scanner sc = new Scanner(System.in);

        return foodDel();

    }
}
