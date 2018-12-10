package Sort;

import Indkøbsliste.Food.Product;

import java.util.Comparator;

public class Quicksort implements Comparator<Product> {

        @Override
        public int compare(Product o1, Product o2) {
            int Compare_One = o1.getStore().compareTo(o2.getStore());
            if (Compare_One != 0) {
                return Compare_One;
            }
            int Compare_TWO = o1.getName().compareTo(o2.getName());
            if (Compare_TWO != 0) {
                return Compare_TWO;
            }
            return 1;
        }
    }

//Collections.sort(LIST, new Quicksort());
