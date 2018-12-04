package recipes;

import Indkøbsliste.Food.Product;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class getRecipes {

    public static List<recipes> getList() throws IOException {

        List<recipes> AllRecipes = new ArrayList<>();

        Gson gson = new Gson();


        BufferedReader in = new BufferedReader(new FileReader("src/recipes/Recipes.json"));
        boolean done = false;
        while (!done) {
            String s = in.readLine();
            if (s == null) {
                done = true;
            } else {
                recipes recipe = gson.fromJson(s, recipes.class);
                AllRecipes.add(recipe);
            }
        }
        return AllRecipes;
    }
}
