package Shoppinglist.Shoppinglist;

import Indkøbsliste.Food.Product;

import Services.Scripts.Json_to_java;
import me.xdrop.fuzzywuzzy.FuzzySearch;
import recipes.recipes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Basicshoppinglist {

    public ArrayList<Product> list = new ArrayList<>();
    List<Product> allProducts;

    public Basicshoppinglist() throws IOException {
        this.allProducts = new Json_to_java().make_list();
    }

    //Add a new ShoppingItem to the list
    public void addItems(List<Product> items){
        list.addAll(items);
    }

    public void removeItem(int index){
        list.remove(index);
    }

    public void addRecipie(recipes recipe){


        List<String> ProductsString = new ArrayList<>();

        for (Product products : allProducts){
            ProductsString.add(products.getName());
        }

        List<String> ingredients = recipe.ingredient;

        for (String ingredient: ingredients) {
            ingredient = ingredient.replaceAll("[^a-z A-ZæøåÆØÅ]", "");
            list.add(allProducts.get(FuzzySearch.extractOne(ingredient, ProductsString).getIndex()));
        }
    }
}
