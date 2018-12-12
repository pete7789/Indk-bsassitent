package Services.Scripts;

import Indkøbsliste.Food.Product;
import Searching.Searching;
import Shoppinglist.Shoppinglist.Basicshoppinglist;
import Sort.Quicksort;
import recipes.*;

import java.io.IOException;
import java.util.List;

public class hest {
    public static void main(String[] args) throws IOException {
        List<Product> test = new Json_to_java().make_list();


        var sorted = new Searching();

        List <Product> sort = sorted.FuzzySearchByName("æble", test, 20);

        List <recipes> AllRecipes = Json_to_java.getRecipes();


        Basicshoppinglist newlist = new Basicshoppinglist();

        newlist.addRecipie(AllRecipes.get(1));

        newlist.list.sort(new Quicksort());



        for (Product tests : newlist.list){
            System.out.println(tests.getName() + " " + tests.getPrice() + " " + tests.getStore());
        }
/*
        Login loginScreen = new Login();
        loginScreen.setVisible(true);
        loginScreen.setLocationRelativeTo(null);

        Diet dietScreen = new Diet();
        dietScreen.setVisible(true);
        dietScreen.setLocationRelativeTo(null);

        Indkoebsliste indkoebslisteScreen = new Indkoebsliste();
        indkoebslisteScreen.setVisible(true);
        indkoebslisteScreen.setLocationRelativeTo(null);

        Opskrifter opskriftScreen = new Opskrifter();
        opskriftScreen.setVisible(true);
        opskriftScreen.setLocationRelativeTo(null);
*/
    }
}
