package Services.Scripts;

import GUI.*;
import Indkøbsliste.Food.Product;
import Searching.Searching;

import java.io.IOException;
import java.util.List;

public class hest {
    public static void main(String[] args) throws IOException {
        List<Product> test = new Json_to_java().make_list();


        var sorted = new Searching();

        List <Product> sort = sorted.FuzzySearchByName("æble", test, 20);

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

    }
}
