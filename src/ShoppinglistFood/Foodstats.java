package ShoppinglistFood;

import java.util.ArrayList;
import java.util.List;

public class    Foodstats implements Food {
    private String foodstats;
    private List<Foodstats> food = new ArrayList<>();
    // other fields as required


    protected Foodstats(String foodstats) {
        this.foodstats = foodstats;

    }


    public String getName(){
        return this.foodstats;

    }

    public Foodstats addfoods() {
        // not sure what your intention is here, but something like this:
        Foodstats obj = new Foodstats(this.foodstats);
        // add new performance to list
        food.add(obj);
        return obj;
    }


    public Foodstats removefoods(){

        Foodstats obj = new Foodstats(this.foodstats);
        // add new performance to list
        food.remove(obj);
        return obj;

    }


}
