package Nutrition;

import me.xdrop.fuzzywuzzy.FuzzySearch;

import java.util.List;

public class EatenFood {

    List<FoodInfo> AllFood;
    List<String> FoodNames;
    List<FoodInfo> FoodEaten;
    int KJ;
    int kcal;

    public EatenFood(List<FoodInfo> allFood) {
        var loadFood = new GetInfo();
        AllFood = loadFood.InfoList;
    }

    public void foodAdd(int amount, String type){

        for (FoodInfo food : AllFood) {
            FoodNames.add(food.getFoodName());
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
