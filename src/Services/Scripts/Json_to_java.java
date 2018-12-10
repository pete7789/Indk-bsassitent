package Services.Scripts;

import Indkøbsliste.Food.Product;
import com.google.gson.Gson;
import recipes.recipes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// The class Json to java converts all the data from the stores to java objects
public class Json_to_java {

        public List<Product> make_list() throws IOException {

            // The var products is used to store all the data in objects
            List<Product> products = new ArrayList<>();

            Gson gson = new Gson();

            String[] Store = new String[]{"Bilka", "Foetex"};

            // This for loop is used to load in the data and place them in the right place in the objects
            for (String aStore : Store) {
                BufferedReader in = new BufferedReader(new FileReader("src/Services/Scripts/" + aStore + ".json"));
                boolean done = false;
                while (!done) {
                    String s = in.readLine();
                    if (s == null) {
                        done = true;
                    } else {
                        Product product = gson.fromJson(s, Product.class);
                        product.setStore(aStore);
                        products.add(product);
                    }
                }
            }
            return products;
        }

    public static List<recipes> getRecipes() throws IOException {

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

