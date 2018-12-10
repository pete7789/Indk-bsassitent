package Shoppinglist.Shoppinglist;

import Indkøbsliste.Food.Product;

import Searching.Searching;
import me.xdrop.fuzzywuzzy.FuzzySearch;
import me.xdrop.fuzzywuzzy.model.ExtractedResult;
import recipes.recipes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basicshoppinglist {

    ArrayList<Product> list = new ArrayList<>();
    ArrayList<String> foodlist = new ArrayList<>();


    //Add a new ShoppingItem to the list
    public void addItem(List<Product> items) {

        System.out.println();
        System.out.println("enter in the name of your item");
        Scanner keyboard = new Scanner(System.in);
        String food = keyboard.nextLine();


        List<ExtractedResult> searchResults = FuzzySearch.extractTop(food, foodlist, 10);


        for (ExtractedResult result : searchResults) {
            list.add(items.get(result.getIndex()));

            System.out.println("Item Added");
        }
    }

    public void displayItem() {
        System.out.println(list.size() + " items. ");
        for (Product x : list) {
            System.out.println(x.toString());
        }

    }
}