package Searching;

import Indkøbsliste.Food.Product;
import me.xdrop.fuzzywuzzy.FuzzySearch;
import me.xdrop.fuzzywuzzy.model.ExtractedResult;

import java.util.ArrayList;
import java.util.List;

public class Searching {

    private ArrayList<String> arraySource = new ArrayList<>();
    private ArrayList<Product> ItemsResults = new ArrayList<>();

    public  ArrayList<Product> FuzzySearchByName(String term, List<Product> items, int cutoff) {

        //avoid OutOfBounds exception
        if (cutoff > items.size()) cutoff = items.size();

        //deep copy items.getName to arraySource
        for (Product item : items) {
            this.arraySource.add(item.getName());
        }
        //run fuzzywuzzy on string-copy of names with a size of cutoff
        List<ExtractedResult> searchResults = FuzzySearch.extractTop(term, arraySource, cutoff);

        //for cutoff, get product from searchResults and add to primitive arraylist
        for (ExtractedResult result : searchResults) {
            ItemsResults.add(items.get(result.getIndex()));
        }
        return ItemsResults;
    }
}