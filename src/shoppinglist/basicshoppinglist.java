package shoppinglist;

import java.util.ArrayList;
import java.util.Scanner;

public class basicshoppinglist {

    ArrayList<basicshoppinglist> list = new ArrayList(basicshoppinglist);

    public void addItem(){
    
        
        System.out.println();
        System.out.println("Enter the name of the item");


      Scanner keyboard = new Scanner(System.in);
        String itemName = keyboard.nextLine();
        basicshoppinglist item = new basicshoppinglist(itemName);
        list.add(item);
          System.out.println("Item added");
    }


}
