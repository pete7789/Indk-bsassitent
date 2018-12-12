package Nutrition;

import me.xdrop.fuzzywuzzy.FuzzySearch;

import java.util.ArrayList;
import java.util.List;

public class EatenFood {

    List<FoodInfo> AllFood;
    public List<FoodInfo> FoodEaten = new ArrayList<>();
    int KJ;
    int kcal;

    public EatenFood() {
        var loadFood = new GetInfo();
        AllFood = loadFood.InfoList;
    }

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

    public void foodDelete(int amount, int index){

        KJ -= FoodEaten.get(index).getKJ() / amount;
        kcal -= FoodEaten.get(index).getKcal() / amount;
        FoodEaten.remove(index);
    }
}
