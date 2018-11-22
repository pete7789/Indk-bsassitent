package Services.Scripts;

import Indkøbsliste.Food.Product;
import Searching.Searching;

import java.io.IOException;
import java.util.List;

public class hest {
    public static void main(String[] args) throws IOException {
        List<Product> test = new Json_to_java().make_list();

        var sorted = new Searching();

        List <Product> sort = sorted.FuzzySearchByName("æble", test, 20);

    }
}
