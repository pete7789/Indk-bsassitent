package Indkøbsliste.Food;

public class Product {
    String Name;
    double Price;
    String Offer;
    String Unit;
    String Image;
    String Store;

    public Product(String name, double price, String offer, String unit, String image, String store) {
        Name = name;
        Price = price;
        Offer = offer;
        Unit = unit;
        Image = image;
        Store = store;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }

    public String getOffer() {
        return Offer;
    }

    public String getUnit() {
        return Unit;
    }

    public String getImage() {
        return Image;
    }

    public String getStore() {
        return Store;
    }
}
