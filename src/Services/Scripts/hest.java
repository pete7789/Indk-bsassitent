package Services.Scripts;

import Indkøbsliste.Food.Product;
import Sort.Quicksort;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class hest {
    public static void main(String[] args) throws IOException {
        List<Product> test = new Json_to_java().make_list();
        Collections.sort(test, new Quicksort());
    }
}
