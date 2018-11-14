package Services.Scripts;

import Indkøbsliste.Food.Product;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Json_to_java {

        List<Product> make_list() throws IOException {

            List<Product> products = new ArrayList<>();

            Gson gson = new Gson();

            String[] Store = new String[]{"Bilka", "Foetex"};

            for (String aStore : Store) {
                BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\mikke\\Desktop\\Indk-bsassitent\\src\\Services\\Scripts\\" + aStore + ".json")); // TODO find a better path
                boolean done = false;
                while (!done) {
                    String s = in.readLine();
                    if (s == null) {
                        done = true;
                    } else {
                        Product product = gson.fromJson(s, Product.class);
                        product.setStore(aStore);
                        System.out.println(product.getStore());
                    }
                }

            }
            return products;
        }
    }
