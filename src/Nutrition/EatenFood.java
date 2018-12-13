package Nutrition;

import me.xdrop.fuzzywuzzy.FuzzySearch;

import java.util.ArrayList;
import java.util.List;

/*This class is made to keep track of what the user eats*/

public class EatenFood {

    List<FoodInfo> AllFood;
    public List<FoodInfo> FoodEaten = new ArrayList<>();
    int KJ;
    int kcal;

/*The constructor loads the DTU information into the class*/

    public EatenFood() {
        var loadFood = new GetInfo();
        AllFood = loadFood.InfoList;
    }

/*The method foodAdd adds the users food to an array and calculate the users kcal intake*/

    public void foodAdd(int amount, String type){


        List<String> FoodNames = new ArrayList<>();

        for (FoodInfo food : AllFood) {
            String check = food.getFoodName();
            if (check.compareTo(" ") != 0) {
                FoodNames.add(check);
            }
        }

        FoodInfo current = AllFood.get(FuzzySearch.extractOne(type, FoodNames).getIndex());
        FoodEaten.add(current);
        KJ += current.getKJ() / amount;
        kcal += current.getKcal() / amount;
    }

/*The foodDelete method removes the users intake again*/

    public void foodDelete(int amount, int index){

        KJ -= FoodEaten.get(index).getKJ() / amount;
        kcal -= FoodEaten.get(index).getKcal() / amount;
        FoodEaten.remove(index);
    }
}
