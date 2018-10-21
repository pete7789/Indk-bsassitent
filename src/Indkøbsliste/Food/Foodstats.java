package Indkøbsliste.Food;

import java.util.ArrayList;
import java.util.List;

public class Foodstats extends Food {
    private String foodstats:
    private List<Foodstats> food = new ArrayList<Foodstats>();
    // other fields as required



    /*private int kcal;
    private int fat;
    private int protein;
    private int carbs;
    private int sugar;
    private int salt;
*/
    Foodstats(String foodstats) {
        this.foodstats = foodstats;




 /*       this.kcal = kcal;
        this.fat = fat;
        this.protein = protein;
        this.carbs = carbs;
        this.sugar = sugar;
        this.salt = salt;
   */
    }


    public String getName(){
        return this.foodstats;

    }

    public List<foodstats> getFoods(){
        return foodstats;
    }



    public Foodstats foods() {
        // not sure what your intention is here, but something like this:
        foods obj = new Foods(String, this);
        // add new performance to list
        foods.add(obj);
        return obj;
    }





/*
    public int getKcal() {
        return this.kcal;

    }

    public int getfat() {
        return this.fat;

    }

    public int getprotein() {
        return this.protein;

    }
    public int getcarbs() {
        return this.carbs;

    }
    public int getsugar() {
        return this.sugar;

    }
    public int getsalt() {
        return this.salt;

    }*/
}
