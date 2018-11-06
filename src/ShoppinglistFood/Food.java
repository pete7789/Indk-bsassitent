package ShoppinglistFood;

public interface Food {

    String getName();
    /*int getKcal();
    int getfat();
    int getprotein();
    int getcarbs();
    int getsugar();
    int getsalt();
    */
    Foodstats addfoods();

    Foodstats removefoods();
}
