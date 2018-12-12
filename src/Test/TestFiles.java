package Test;

import Indkøbsliste.Food.Product;
import Nutrition.EatenFood;
import Nutrition.GetInfo;
import Nutrition.kcalcalcu;
import Services.Scripts.Json_to_java;
import Shoppinglist.Shoppinglist.Basicshoppinglist;
import org.junit.jupiter.api.Test;
import recipes.recipes;

import java.io.IOException;
import java.util.List;

import static Services.Scripts.Json_to_java.getRecipes;
import static Services.Scripts.Json_to_java.make_list;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFiles {


    @Test
    public void CheckJsonStores() throws IOException {
        List<Product> products = Json_to_java.make_list();
        assertEquals(products.get(1).getStore(), "Bilka");

    }

    @Test
    public void CheckJsonRecipe() throws IOException {
        List<recipes> AllRecipes = Json_to_java.getRecipes();
        assertEquals(AllRecipes.size(), 10);

    }

    @Test
    public void EmptyList() throws IOException {
        var ShoppingList = new Basicshoppinglist();
        assertEquals(0, ShoppingList.list.size());
    }

    @Test
    public void AddItem() throws IOException {
        var ShoppingList = new Basicshoppinglist();
        List<Product> products;
        products = make_list();
        ShoppingList.addItems(products.get(0));
        assertEquals(1, ShoppingList.list.size());
        assertEquals(products.get(0), ShoppingList.list.get(0));
    }

    @Test
    public void RemoveItem() throws IOException {
        var ShoppingList = new Basicshoppinglist();
        List<Product> products;
        products = make_list();
        ShoppingList.addItems(products.get(0));
        ShoppingList.addItems(products.get(1));
        ShoppingList.removeItem(0);
        assertEquals(1, ShoppingList.list.size());
        assertEquals(products.get(1), ShoppingList.list.get(0));
    }

    @Test
    public void AddRecipe() throws IOException {
        var ShoppingList = new Basicshoppinglist();
        var Recipes = getRecipes();
        ShoppingList.addRecipie(Recipes.get(0));
        assertEquals(4, ShoppingList.list.size());
    }

    @Test
    public void SetNGetName(){
        String ost = "ost";
        var product = new Product();
        product.setName(ost);
        assertEquals(ost, product.getName());
    }

    @Test
    public void SetNGetPrice(){
        String price = "22,5";
        var product = new Product();
        product.setPrice(price);
        assertEquals(price, product.getPrice());
    }

    @Test
    public void SetNGetStore(){
        String Store = "bilka";
        var product = new Product();
        product.setStore(Store);
        assertEquals(Store, product.getStore());
    }

    @Test
    public void SetNGetImg(){
        String something = "yay";
        var product = new Product();
        product.setImg(something);
        assertEquals(something, product.getImg());
    }

    @Test
    public void SetNGetOffer(){
        String something = "yay";
        var product = new Product();
        product.setOffer(something);
        assertEquals(something, product.getOffer());
    }

    @Test
    public void SetNGetUnit(){
        String something = "yay";
        var product = new Product();
        product.setUnit(something);
        assertEquals(something, product.getUnit());
    }

    @Test
    public void AddFoodToDiet(){
        var NewList = new EatenFood();
        NewList.foodAdd(100, "Cheese");
        assertEquals(1, NewList.FoodEaten.size());
    }

    @Test
    public void LoadInDTUInfo(){
        var info = new GetInfo();
        assertEquals(1188, info.getInfoList().size());
    }

    @Test
    public void KcalCalculate(){
        var calculate = new kcalcalcu(185, 80);
        assertEquals(2000, calculate.getKcalcal());
    }
}
