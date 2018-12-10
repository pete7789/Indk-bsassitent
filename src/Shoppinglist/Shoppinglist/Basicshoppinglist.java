package Shoppinglist.Shoppinglist;

import Indkøbsliste.Food.Product;

import Services.Scripts.Json_to_java;
import me.xdrop.fuzzywuzzy.FuzzySearch;
import me.xdrop.fuzzywuzzy.model.ExtractedResult;
import recipes.recipes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basicshoppinglist {

    public ArrayList<Product> list = new ArrayList<>();
    List<Product> allProducts;
    List<String> bla;

    public Basicshoppinglist() throws IOException {
        this.allProducts = new Json_to_java().make_list();
    }

    //Add a new ShoppingItem to the list
    public void addItem(List<Product> items){

        System.out.println();
        System.out.println("enter in the name of your item");
        Scanner keyboard = new Scanner(System.in);
        String food = keyboard.nextLine();

        List<ExtractedResult> searchResults = FuzzySearch.extractTop(food, bla, 10);


        for (ExtractedResult result : searchResults) {
            list.add(items.get(result.getIndex()));

            System.out.println("Item Added");
        }
    }
    
    public void displayItem(){
        System.out.println(list.size() + " items. ");
        for (Product x : list) {
            System.out.println(x.toString());
        }

    }

    public void addRecipie(recipes recipe){


        List<String> ProductsString = new ArrayList<>();

        for (Product products : allProducts){
            ProductsString.add(products.getName());
        }

        List<String> ingridiens = recipe.ingredient;

        for (String ingredient: ingridiens) {
            ingredient = ingredient.replaceAll("[^a-z A-ZæøåÆØÅ]", "");
            list.add(allProducts.get(FuzzySearch.extractOne(ingredient, ProductsString).getIndex()));
        }
    }
}
